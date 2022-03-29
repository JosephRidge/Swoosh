## This project focuses on :
- Activity lifecycle
- Use of Intents (Explicit & Implicit)
- Parceleables
- More UI build , highlighting on toggle button widget

## Activity Lifecycle
 In the process of a client using your application,
 the client may tend to navigate out of and into activities or out and back to the application.
 Hence, the activity class provides callbacks that aid the activity to know if the
 current state has changed.
An activity lifecycle goes through :
- Creating
- Stopping
- Resuming
- Destroying  the process in which the activity resides.
with the lifecycle we are able to declare how the activity
behaves when the user leaves and reenters the activity.
Doing the right work at the right time and handling transitions well, makes the app performant and robust.

With lifecycle we can prevent :
- Crashing if user receives a phone call or switches to another application.activity
- Loosing client progress if client leaves app and returns to it later on
- crashing and loosing progress upon orientation changed