
# Bike Tracker

Bike Tracker is a mobile application created as part of the "Mobile Applications" classes. Primary purpose of this application is to record the user's cycling route, which is displayed in real-time on a map. Once the ride is finished, users can access information about the date, duration, average speed, and distance of their journey. The app also estimates the number of calories burned during the activity. Besides cycling, the Bike Tracker app is suitable for people who prefer other forms of exercise, such as running or walking.

# Used Technologies

- Kotlin
- Google Maps SDK
- Dagger hilt
- Room database

# Features

- Cycling route tracking,
- Marking mapping on the map,
- History of recorded routes,
- Displaying average riding speed,
- Displaying cycling route distances,
- Displaying ride duration,
- Displaying calories burned.

# Application Snapshots

**Welcome screen** is the first thing we see after launching the "Bike Tracker" app. It serves as an introduction to the app's theme and allows users to start using the tracker. By pressing the "Let's Begin" button, we are taken to the main screen of the app. On the first visit, we will be prompted to grant location permissions.

![1](https://user-images.githubusercontent.com/57503560/230638470-8f52df28-21eb-492b-bd6f-40d87015ada4.png)

**Main screen** is used for navigation. It allows users to navigate to the "Record Route" and "Route History" screens. Meanwhile, the "Exit" button closes the tracker.

![2](https://user-images.githubusercontent.com/57503560/230638569-d85463a8-a8a6-4d73-96f4-882016d0acf4.png)

**Route recording screen** is designed for recording bike routes. By pressing the "Start" button, route recording begins. As we move on the bike, a line is drawn on the map, indicating the route we are taking. Figure shows an example of a recorded route. The app can also work in the background when minimized. Pressing the "End" button stops route recording and saves it to the database. The "Exit" button is used to leave the route recording screen, which results in the loss of the currently recorded route.


![4](https://user-images.githubusercontent.com/57503560/230638931-3ccae5a5-23c7-48d2-af1a-b0799d85c308.png)
![Screenshot_2](https://user-images.githubusercontent.com/57503560/230639580-fb67e073-699d-4bd3-8891-a9858dc72758.png)


**Saved route history screen** here, we can see map images with the final route. Additionally, information about the date, travel time, average speed, and length of each route is displayed under each image. An approximate number of burned calories is also calculated using a simple formula.

![6](https://user-images.githubusercontent.com/57503560/230638787-9922dded-f086-497e-ab3c-5ff8746b7a3d.png)

The completed app is designed for potential users seeking an application for recording bike routes. The user-friendly and simple app can make workouts easier and allow tracking of our progress.
