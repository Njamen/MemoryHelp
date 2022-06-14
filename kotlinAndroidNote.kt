==> Mockito 
https://www.journaldev.com/21866/mockito-mock-examples
https://www.vogella.com/tutorials/Mockito/article.html


==>   settings preferences  storing data in datastore datastore 
https://eng-nohasamirsaad.medium.com/setting-preference-summary-ebc4aab4ccfa
https://stackoverflow.com/questions/32487206/inner-preferencescreen-does-not-open-with-preferencefragmentcompat
https://developer.android.com/guide/topics/ui/settings/customize-your-settings
https://medium.com/nerd-for-tech/time-picker-and-custom-entries-in-preference-fragment-made-simple-1e0e125ff2ac

==> clear the back trace 
https://stackoverflow.com/questions/50514758/how-to-clear-navigation-stack-after-navigating-to-another-fragment-in-android
==> fragment dialog 
https://blog.mindorks.com/implementing-dialog-fragment-in-android

==> ProcessLifecycleOwner
https://stackoverflow.com/questions/52369540/what-is-lifecycle-observer-and-how-to-use-it-correctlys

==>  hilt dependencies injection
	https://developer.android.com/training/dependency-injection/hilt-android 
	https://dagger.dev/hilt/components.html

==>  kotlinflow and coroutines 
	https://blog.ippon.fr/2021/01/08/des-flux-asynchrones-avec-kotlin-flow/
	https://kotlinlang.org/docs/flow.html#exception-transparency
	https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/
	https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/

	
==>  preferences datastore 
	https://www.section.io/engineering-education/getting-started-with-datastore-in-kotlin/	

==> proto datastore http links 
  https://github.com/ch8n/Jetpack-compose-thatsMine
  https://www.raywenderlich.com/18348259-datastore-tutorial-for-android-getting-started#toc-anchor-005
  https://developer.android.com/codelabs/android-preferences-datastore#0
  https://developer.android.com/topic/libraries/architecture/datastore#kotlin

==> retrofit request
https://www.programcreek.com/java-api-examples/?api=retrofit.http.PUT
java code 

==> kotlin coroutines 
https://kotlinlang.org/docs/reference/coroutines/basics.html

==>  Architecture component android
https://developer.android.com/jetpack/guide


==> COIL library 
https://medium.com/better-programming/how-to-use-coil-kotlins-native-image-loader-d6715dda7d26


==> drop down menu 
https://www.material.io/develop/android/components/menu#exposed-dropdown-menus


==> material design versus just design 
https://medium.com/androiddevelopers/migrating-to-material-components-for-android-ec6757795351  

==> Frozen keyboard input android studio 
https://stackoverflow.com/questions/30756488/keyboard-issues-with-android-studio-on-ubuntu
$ IBUS_ENABLE_SYNC_MODE=1 ibus-daemon -xrd

==> http vs https both are really different even we want to access and url we need to considere it 
==> To access  via a  local network a server host in a pc using a phone where is running an android app,
we need to take to considation those thing

https://stackoverflow.com/questions/45940861/android-8-cleartext-http-traffic-not-permitted
https://better-coding.com/solved-android-cannot-send-data-to-the-server-cleartext-communication-to-not-permitted-by-network-security-policy/


==> server not handling https requests 
If you are working with mobile apps, it is required that your server supports SSL.


==> moshi Json converter  
https://proandroiddev.com/getting-started-using-moshi-for-json-parsing-with-kotlin-5a460bf3935a

==>  retrofit 
https://dev.to/paulodhiambo/kotlin-and-retrofit-network-calls-2353 
https://futurestud.io/tutorials/retrofit-2-catch-server-errors-globally-with-response-interceptor 
https://www.chillcoding.com/blog/2017/03/14/requete-http-get-retrofit-android/

===> navigation component  : load fragment from activity 
            val navController = findNavController(activity, R.id.nav_host_fragment)
            navController.navigateUp()
            navController.navigate(R.id.nav_school_year)


==> kotlin case 
        when(item.itemId) {
            R.id.school_year_menu_cancel_selection_l_id -> {
              adapter.cancelAllSelectedItem()
            }
            else -> {}
        }



==> set text style programmatically in a textview
https://stackoverflow.com/questions/7919173/android-set-textview-textstyle-programmatically 

String text_view_str = "<b>Bolded text</b>, <i>italic text</i>, even <u>underlined</u>!";
TextView tv = (TextView)findViewById(R.id.ur_text_view_id);
tv.setText(Html.fromHtml(text_view_str));


==> enum class 
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

==> scroolbar 
https://www.tutlane.com/tutorial/android/android-scrollview-horizontal-vertical-with-examples

        root.scrollView3.post {     //kotlin code
            root.scrollView3.fullScroll(View.FOCUS_RIGHT)
        }


==> toolbar 
https://guides.codepath.com/android/using-the-app-toolbar


===>  get color and get drawable

itemView.item_l_id.setCardBackgroundColor(
    ContextCompat.getColor(NSchoolApplication.theContext, R.color.colorAccent)
)


NSchoolApplication.theContext.resources.getDrawable(R.drawable.arrow_drop_down_24px)
itemView.expand_button_l_id.setImageDrawable(drawble)

                placeholder(R.drawable.noimage)


==> change hambugger button 
https://mobikul.com/change-hamburger-icon-android/

        val toolbar = activity?.findViewById<Toolbar>(R.id.toolbar)
        val drawerLayout = activity?.findViewById<DrawerLayout>(R.id.drawer_layout)

        val mDrawerToggle = ActionBarDrawerToggle(activity, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        mDrawerToggle.setDrawerIndicatorEnabled(false)
        mDrawerToggle.setHomeAsUpIndicator(R.drawable.ic_menu_send);

        mDrawerToggle.setToolbarNavigationClickListener {
            drawerLayout?.openDrawer(GravityCompat.START)
        }



===> Change menu in an application 
https://android.i-visionblog.com/android-changing-menu-items-at-run-time-48970f0cf1b7

onCreateOptionsMenu(Menu menu){}  // for activity

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.school_year_menu,menu);
    }  // for fragments  do not forget 
    
        setHasOptionsMenu(true);
 ---------------
 🔑 If application contains multiple activities it may provide the same options menu in that situation we can inherits the menu’s behavior by simply just extends the class which implements nothing except the onCreateOptionsMenu() and onOptionsItemSelected() methods.This way, we can manage one set of code for handling menu actions and each descendant class inherits the menu behaviors. If you want to add menu items to one of the descendant activities, override onCreateOptionsMenu() in that activity. Call super.onCreateOptionsMenu(menu) so the original menu items are created and can also override the super class’s behavior for individual menu items.


@Override
public boolean onPrepareOptionsMenu(Menu menu) {
    if(Build.VERSION.SDK_INT > 11) {
        invalidateOptionsMenu();
        menu.findItem(R.id.option2).setVisible(false);
        menu.findItem(R.id.option4).setVisible(true);
    }
    return super.onPrepareOptionsMenu(menu);
}

===>  Inner and Nested Class
In Kotlin, there are 2 types of the nested classes : 
    Nested Class  inner Class 
Nested class are not allowed to access the member of the outer class. 
If you want to access the member of outer class in the nested class then you need to define that nested class as inner class.
To access the parent class in the inner class, use this@OuterClass 


===> Navigation component code 
findNavController().navigate(R.id.action_nav_home_to_nav_slideshow)


===> Navigation component 
https://developer.android.com/guide/navigation/navigation-getting-started
https://medium.com/incwell-innovations/passing-data-in-android-navigation-architecture-component-part-2-5f1ebc466935



==> icon for android apphttps:

https://developer.android.com/studio/write/image-asset-studio
In the manifest filr 
Change android:icon and android:roundIcon to the name you have chosen for your launcher icon.



=> addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


=> Cannot inline bytecode built with JVM target 1.8 into bytecode that is being built with JVM target 1.6


app/build.gradle file

android {
    ...
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}



=> 
How to Create Android App Icons using Image Asset Studio
Run Image Asset Studio 
   1- In the Project Window, select the project hierarchy.
   2- Right-click on the res folder and choose New -> Image Asset.
   3- Create the icon for your app i.e. 
	    Launcher icon which may be Adaptive and Legacy Launcher Icon (if your app supports Android 8.0 or above) or just the Legacy Launcher       Icon(for Android version less than or equal to 7.1)
	    ActionBar Icons and Tab Icons
	    notification icon as per your requirement.

   4-You can select the following Asset Type. The icon appears on the right side, in the preview panel.
	    Custom Image
	    Clip Art
	    Text String






                android:background="@color/firstPageButtonColor"

// androidx.appcompat.widget.AppCompatButton  styles 

	style="@style/Widget.AppCompat.Button"
	style="@style/Widget.AppCompat.Button.Colored"
	style="@style/Widget.AppCompat.Button.Borderless"
	style="@style/Widget.AppCompat.Button.Borderless.Colored"

-------

	<style name="AppTheme.Button" parent="Widget.AppCompat.Button.Colored">
	    <item name="colorButtonNormal">@color/Red</item>
	    <item name="android:textColor">@color/White</item>
	</style>


// asset folder 
     create it from app folder of the app structure 
Create assets folder in Android Studio

    Navigate to Packages, ...
    You would see app as the root folder, right click on it and select : New -> Folder -> Assets Folder,
    You would get a Dialog : Create a source root for assets which will be included in APK. ...
    Click Finish.
    Now move back to Android Project view, you should be able to see the assets folder now.
    
    
    url of a file inasset folder 
           file:///android_asset/b3_logo_cesngassa.png

	

// list alert dialog box 

            val builder = AlertDialog.Builder(this@StudentRcTrimActivity)
            builder.setTitle("Choisir le type de bulletins.")
            builder.setItems(array, { _, which ->
                // Get the dialog selected item
                val selected = array[which]

                if (which == 0 ){
                    reportCardChoice = Constants.REPORT_CARD_SIMPLE
                }else if( which == 1){
                    reportCardChoice = Constants.REPORT_CARD_WITH_TARGETED_SKILLS
                }
            })
            val dialog = builder.create()
            dialog.show()

// notification withoutchanel
            val intent = Intent(this, ListOfMessagesActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, 0)


            var builder = NotificationCompat.Builder(this,"14")
                .setSmallIcon(R.drawable.navigation_empty_icon)
                .setContentTitle(data["title"])
                .setContentText(data["message"])
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)


            with(NotificationManagerCompat.from(this)) {
                // notificationId is a unique int for each notification that you must define
                notify(12, builder.build())
            }

//Snackbar

            Snackbar.make(currentFocus.rootView /*view*/, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
// hashMap
	var map: HashMap<Int, Person> = HashMap() 
	map.put(1, person) 
	for((key, value) in map){
	    println("Key: $key, Value: $value")
	}
//recycleView
  1- design the itemview( atomic element of the recycleview  
  2- create and associate a layout manager which is responsibble 
     to control item arrangement and positioning( list of grid )
       represented by RecyclerView.LayoutManager can be extend to create custom Layout manager
     Android provides common implementation to handle common senarios like 
        LinearLayoutManger and gridLayoutManager and StaggeredGridLayoutManager(like a grid but
        each item individually sized)

        formview.recycleView_l_id.layoutManager = LinearLayoutManager(activity)
 
  3- crate and associate and adapter which is responsible of 
        * construct  item view instances
        * manages data interaction
        * Associate data items with items view
    Extend the class RecyclerView.Adapter 
   
	

// upload an image

        formview.profile_image.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.setType("image/*")
            startActivityForResult(intent,PICK_FILE_REQUEST_CODE)
        }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == PICK_FILE_REQUEST_CODE && resultCode == Activity.RESULT_OK){
            val selectedImageUri = data!!.data as Uri
            formview.profile_image.setImageURI(selectedImageUri)
        }
    }

        formview.profile_image.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            intent.setType("image/*")
            startActivityForResult(intent,CAMERA_REQUEST_CODE)
        }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == CAMERA_REQUEST_CODE && resultCode == Activity.RESULT_OK){
              val bitmap = data!!.extras.get("data") as Bitmap
              formview.profile_image.setImageBitmap(bitmap)
        }
    }


//   Editable
 formView.birthMonth_l_id.text = Editable.Factory.getInstance().newEditable(month?:"")

// add a actionbar 

<menu xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      tools:context="nlabsgroup.androidapps.chatapp.presentation.Activities.ListOfMessagesActivity">
    <item android:id="@+id/action_sign_out"
          android:title="@string/action_my_profile"
          android:orderInCategory="100"
          app:showAsAction="never"/>
    <item android:id="@+id/action_myProfile"
          android:title="@string/action_sign_out"
          android:orderInCategory="100"
          app:showAsAction="never"/>
</menu>

    <com.google.android.material.appbar.AppBarLayout
            android:layout_height="wrap_content"
            android:layout_width="match_parent"
            android:theme="@style/AppTheme.AppBarOverlay">

        <androidx.appcompat.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                android:background="?attr/colorPrimary"
                app:popupTheme="@style/AppTheme.PopupOverlay"/> 
    </com.google.android.material.appbar.AppBarLayout>

    override  fun onCreateOptionsMenu(menu: Menu): Boolean {
         menuInflater.inflate(R.menu.menu_list_of_messages, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_sign_out -> {
//actions
            true
        }
        R.id.action_myProfile -> {
//actions
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

//viewModel
   class LoginViewModel : ViewModel(){
      val loginFormState = MutableLiveData<LoginFormState>()
   }

   private val loginViewModel: LoginViewModel by lazy {
	 ViewModelProviders.of(this).get(LoginViewModel::class.java)
   }

    private val loginViewModel: LoginViewModel by lazy {
       // ViewModelProviders.of(this).get(LoginViewModel::class.java)
      ViewModelProviders.of(this, LoginViewModelFactory(activity as AppCompatActivity))
            .get(LoginViewModel::class.java)
    }

/**
 * ViewModel provider factory is Required when LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

//start Activity 
    val intent = Intent(activity,Activity1::class.java)
    intent.putExtra("selectedTeacher_c", teacher_c )
    startActivity(intent)

//start Activity with return value 

    val customIntent = Intent(this,AddStudentsMarksActivity::class.java)
    customIntent.putExtra("listOfStudentsMarks", listOfStudentsMarks)
    customIntent.putExtra("toolbarSubtitle", toolbar_studentActivity.subtitle )
    startActivityForResult(customIntent ,  1)

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        toast("on acticity result")

        if (resultCode == Activity.RESULT_OK) {

        }
    }

   val intentToback = Intent()
       intentToback.putExtra("listOfStudentsMarks", jsonListOfUpdatedStudentsMark)
 	setResult(Activity.RESULT_OK, intentToback)
	finish()

// attach a fragment to an activity
   supportFragmentManager
      .beginTransaction()
      .add(R.id.fragment_container, NewUserFragment.newInstance(), "newUserFragment")
      .commit()

// extensions function example on an edittext
fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}

//////////////////////////////////////////////

    <string name="server_url">"https://cesmandjaora-nschoolsystem.herokuapp.com/api/"</string>
    <string name="server_url">"https://cpbpmc-app.herokuapp.com/api/"</string>
    <string name="server_url">"https://testces-nschoolsystem.herokuapp.com/api/"</string>
    
    
    
    
    
    
    az55p
    
    
    
    
    
    
    
