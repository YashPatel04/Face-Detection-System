# Java Face Detection System using OpenCV

1.  [Introduction](#introduction)
2.  [Dependencies](#prerequisites-and-dependencies)
3.  [Installation](#installation)
4.  [Usage](#usage)
5.  [Contribution](#contribution)

## Images
<div style="display: flex;">
  <img src="https://github.com/YashPatel04/Face-Detection-System/assets/132531512/4415eeb3-ee06-4426-892e-b4be5c29e534" width="500" />
  <img src="https://github.com/YashPatel04/Face-Detection-System/assets/132531512/ff8d23d7-3d18-4b32-b1c5-652a980de67f" width="500" />
</div>


## Introduction
This project is a Java-based face recognition system developed using OpenCV. It utilizes a webcam to capture live video, effectively detecting and highlighting faces in the streaming video feed. With applications spanning from surveillance to various industries, this system employs OpenCV's VideoCapture functionality and Haar cascades classifiers to proficiently recognize and outline faces in real-time video streams. 

## Prerequisites and Dependencies
- Java JDK 21
- OpenCV 4.9.0

## Installation
1. Clone the repository: `git clone https://github.com/YashPatel04/Face-Detection-System.git`
2. Navigate to the project directory: `cd Face Detection System`
3. Make sure you have the required JDK and OpenCV installed.

## Usage
#### Running in IDE 
1. Update the paths of the file, `icon.jpg`, `icons8-npc-face-32.png` and `haarcascade_frontalface_default.xml` in your IDE if necessary.
2. Run the `main.java` file to start the application.
3. Click on the `openCameraButton` to start the camera.
4. Click on the `detectButton` to start face detection.
5. Click on the `back` button to stop the camera or detection.
6. Click on the `exitButton` to close the application.

#### Executing the `.jar` file
- Navigate to `out/artifacts/Face_Recognition_System_jar` and double click on the `.jar` file.
  
NOTE: If you are having any problems with executing the jar file kindly open `src/detect.java` in your IDE and change the path of the haar cascade classifier to the absolute path of the file in your system

## Contribution
Pull requests and improvements are always welcome.For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)

