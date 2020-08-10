# NASA-APOD
Shows the images of [Astronomy Picture of the Day (APOD)](https://api.nasa.gov/planetary/apod) from NASA

## About
This project presents a user with a set of images downloaded from NASA public API. The user will be able to scroll through images and use a swipe to refersh pull from the top pf the screen to reload a new set of images from NASA.

* Tech-stack
    * [Java]
    * [RxJava](https://github.com/ReactiveX/RxAndroid/blob/3.x/README.md) - Perform background operation
    * [Retrofit](https://square.github.io/retrofit/) - Networking
    * [Jetpack](https://developer.android.com/jetpack)
        * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Notify views about database change
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - Perform action when lifecycle state changes
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Store and manage UI-related data in a lifecycle conscious way
    * [Pull/Swipe-to-Refresh](https://developer.android.com/training/swipe) - The swipe-to-refresh design pattern, which allows users to trigger an update with a vertical swipe
       
* Architecture
    * Clean Architecture
    * MVVM
    * [Android Architecture components](https://developer.android.com/topic/libraries/architecture)
 
 ## Output
 
 <img src="https://github.com/ashok-b/NASA-APOD/blob/master/media/no_inernet.png" title="No internet" alt="No internet" width="200" height="400"> <img src="https://github.com/ashok-b/NASA-APOD/blob/master/media/pull_to_refresh.png" alt="Pull to Refresh" title="Pull to Refresh" width="200" height="400"> <img src="https://github.com/ashok-b/NASA-APOD/blob/master/media/results_with_default_.png" alt="Loading images" title="Loading images"  width="200" height="400"> <img src="https://github.com/ashok-b/NASA-APOD/blob/master/media/results_loaded.png" alt="Loaded images" title="Loaded images" width="200" height="400"> <img src="https://github.com/ashok-b/NASA-APOD/blob/master/media/details_on_click.png" alt="Description on click of an Item"  title="Description on click of an Item" width="200" height="400"> 
