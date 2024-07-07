import cv2
import emoji

def remove_emojis(video_path):
    cap = cv2.VideoCapture(video_path)
    fps = cap.get(cv2.CAP_PROP_FPS)
    width = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))
    height = int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
    fourcc = cv2.VideoWriter_fourcc(*'mp4v')
    out = cv2.VideoWriter('output_video.mp4', fourcc, fps, (width, height))

    while True:
        ret, frame = cap.read()
        if not ret:
            break

        # Remove emojis from each frame
        for y in range(height):
            for x in range(width):
                pixel = frame[y, x]
                if any(char in emojis.db.EMOJI_DATA for char in str(pixel)):
                    frame[y, x] = [0, 0, 0]  # Set pixel to black

        out.write(frame)

    cap.release()
    out.release()

# Usage
remove_emojis('C:\\Users\\gn\\Downloads\\apogio\\IMG.MP4')