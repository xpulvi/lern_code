import Image from "next/image";
import { Logo } from "../icons/logo";

import Link from "next/link";


interface NavbarProps {
  user?: User | null;
}

const Navbar = ({ user }: NavbarProps) => {
  return (
    <div className="bg-white">
      <div className="flex max-w-7xl mx-auto p-8 items-center">
        <div className="flex-1">
          <Link href="/">
            <img src="components\icons\the_logo_X.png" className="w-32 md:w-48" />
          </Link>
        </div>
        <div>

           
        </div>
      </div>
    </div>
  );
};

export default Navbar;