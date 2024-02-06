package com.crudTestDemo.servicis;

import com.crudTestDemo.entitis.User;
import com.crudTestDemo.repositoris.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicis {

    @Autowired
    private IUserRepository iUserRepository;

    public void setUserActivationStatus(Long userId, boolean isActive){
        Optional<User> user = iUserRepository.findById(userId);
        if(!user.isPresent()) return;
        user.get().setActive(isActive);
        iUserRepository.save(user.get());
    }

    public User createUser(User user){
        User UserSave = iUserRepository.save(user);
        return UserSave;
    }

    public User patchPerson(Long id, User user){
        User existingPerson = iUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found with id: " + id));

        if (user.getName() != null){
            existingPerson.setName(user.getName());
        }

        if (user.getDescriptib_name() != null){
            existingPerson.setDescriptib_name(user.getDescriptib_name());
        }

        if (user.getSurname() != null){
            existingPerson.setSurname(user.getSurname());
        }

        if (user.getNikename() != null){
            existingPerson.setNikename(user.getNikename());
        }

        if (user.getWork() != null){
            existingPerson.setWork(user.getWork());
        }

        if (user.getAge_at_death() != 0){
            existingPerson.setAge_at_death(user.getAge_at_death());
        }

        if (user.getFirst_appears() != null){
            existingPerson.setFirst_appears(user.getFirst_appears());
        }

        return iUserRepository.save(existingPerson);

    }



    //public cekParental

    /**
     * modeifay existing user
     * @param id
     * @param user
     * @return
     */
    public User putSingleUser(Long id, User user){
        user.setId(id);
        User newUser = iUserRepository.save(user);
        return newUser;
    }

    public List<User> userList(){
        List<User> customerList = iUserRepository.findAll();
        return customerList;
    }

    public Optional<User> getSingleUser(Long id)throws Exception{

        try {
            if (iUserRepository.existsById(id)){
                Optional<User> singleUser = iUserRepository.findById(id);
                return singleUser;
            }else {
                System.out.println("non esiste");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public String delateUser(Long id){
        //HttpServletResponse response = null;
        if (iUserRepository.existsById(id)) {
            iUserRepository.deleteById(id);
            // response.setStatus(HttpServletResponse.SC_OK);
            return id + ": delate" ;
        }else {
            System.out.println("va che non ce sto id " + id);
            //response.setStatus(HttpServletResponse.SC_CONFLICT);
            return ""; // Restituisci una stringa vuota in caso di conflitto
        }
    }

}
