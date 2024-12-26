# InstantPortfolioAndroid

## Opt-in to Instant app to experience instant app in playstore

https://support.google.com/googleplay/answer/7240211?hl=en

instant app which you can directly try without installing

<a href='https://play.google.com/store/apps/details?id=com.prudhvir3ddy.portfolio'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png' width = "150px"/></a>


https://prudhvir3ddy.github.io/mobile/ 

if you open this link on an Android device, it should directly open the app 

### How it shows in playstore
<img width="358" alt="Screenshot 2024-12-22 at 11 42 52 PM" src="https://github.com/user-attachments/assets/2e97f12d-483a-4d1f-9af9-5a377f6dfc25" />


The app has two flavours

- instant ( one that works with Try Now)
- installed ( installable app from playstore )

To run an instant app in local, run these commands

```groovy
 ./gradlew assembleSplitsInstantRelease
 ./gradlew runinstantInstantRelease
```

To publish the app, use android studio to generate bundles regularly.

When uploading in playstore, make sure to have aab version of the instant app has less version code
than the main app


Also, select instant app here for uploading instant app build
![Screenshot 2024-12-22 at 8 46 46 PM](https://github.com/user-attachments/assets/ded71000-f7e3-46f5-8c53-2ac837b9b372)

