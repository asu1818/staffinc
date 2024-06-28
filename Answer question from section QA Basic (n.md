Answer question from section QA Basic (non-automation) : 
1. Test case : 
    * Test Code : TEST001
        Feature : Sign Up
        Summary : As a new user, i can sign up to the app successfully using valid data.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Daftar
            3. Fill data mandartory : 
                * Nama sesuai KTP
                * Jenis Kelamin
                * Tanggal Lahir
                * Email
                * Provinsi tempat tinggal saat ini
                * Kota Tempat Tinggal
                * Nomor Telepon
            4. Click checkbox Syarat dan Ketentuan
            5. Click Button Lanjut
            6. Fill otp
            7. Click Button Lanjut
        Test Data : 
            1. user data (name, gender, date of birth, email, province & city, phone number)
            2. OTP number
        Expected Result : 
            1. User redirect to Verfication Phone Number after fill data from regristation page
            2. User can input otp number
            3. User get notif successful sign up to staffinc

    * Test Code : TEST002
        Feature : Sign Up
        Summary : As a new user, i can't sign up to the app successfully due to using invalid email.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Daftar
            3. Fill data mandartory : 
                * Nama sesuai KTP
                * Jenis Kelamin
                * Tanggal Lahir
                * Email
                * Provinsi tempat tinggal saat ini
                * Kota Tempat Tinggal
                * Nomor Telepon
            4. Click checkbox Syarat dan Ketentuan
        Test Data : 
            1. user data (name, gender, date of birth, province & city, phone number)
            2. using invalid format email
        Expected Result : 
            1. user get warning under email field as "Format email tidak benar"
            2. user can't click button lanjut

    * Test Code : TEST003
        Feature : Sign Up
        Summary : As a user, i can't sign up to the app due to phone number already registered.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Daftar
            3. Fill data mandartory : 
                * Nama sesuai KTP
                * Jenis Kelamin
                * Tanggal Lahir
                * Email
                * Provinsi tempat tinggal saat ini
                * Kota Tempat Tinggal
                * Nomor Telepon
            4. Click checkbox Syarat dan Ketentuan
            5. Click Button Lanjut
        Test Data : 
            1. user data (name, gender, date of birth, email, province & city)
            2. using phone number existing (already registered)
        Expected Result : 
            1. User get warning notif like bottom sheet with :  
                * title "Ups, terjadi kesalahan"
                * sub title "Nomor kamu telah terdaftar. Silahkan login menggunakan nomor telepon ini atau mendaftar dengan nomor lain."
            2. Show button Masuk and button Kembali
    
    * Test Code : TEST004
        Feature : Sign Up
        Summary : As a user, i don't get number OTP at verification page after submit data from regristation page.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Daftar
            3. Fill data mandartory : 
                * Nama sesuai KTP
                * Jenis Kelamin
                * Tanggal Lahir
                * Email
                * Provinsi tempat tinggal saat ini
                * Kota Tempat Tinggal
                * Nomor Telepon
            4. Click checkbox Syarat dan Ketentuan
            5. Click Button Lanjut
        Test Data : 
            1. user data (name, gender, date of birth, email, province & city, phone number)
        Expected Result : 
            1. The user stuck on verification page without whatsapp message OTP Number
            2. Show button Klik Disini for resent trigger to get otp number
            2. Button lanjut becoming greyout or not clickable
    
    * Test Code : TEST005
        Feature : Sign Up
        Summary : As a user, I can't get OTP number event though several times trigger to get otp number.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Daftar
            3. Fill data mandartory : 
                * Nama sesuai KTP
                * Jenis Kelamin
                * Tanggal Lahir
                * Email
                * Provinsi tempat tinggal saat ini
                * Kota Tempat Tinggal
                * Nomor Telepon
            4. Click checkbox Syarat dan Ketentuan
            5. Click Button Lanjut
            6. Click button "Klik Disini"
        Test Data : 
            1. user data (name, gender, date of birth, email, province & city, phone number)
        Expected Result : 
            1. The user stuck on verification page without whatsapp message OTP Number
            2. Show button Klik Disini for resent trigger to get otp number
            3. Button lanjut becoming greyout or not clickable

    * Test Code : TEST006
        Feature : Sign In
        Summary : As a user, I can successfully sign in into the app.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Masuk
            3. Fill phone number
            4. Click Button Lanjut
            5. Fill OTP Number
            6. Click button lanjut
        Test Data : 
            1. user data (Phone number that already registered)
            2. OTP
        Expected Result : 
            1. Sign in successfull
            2. Redirect to home page

    * Test Code : TEST007
        Feature : Sign in
        Summary : As a user, I can't sign in into the app due to reach limit to get otp number.
        Action step : 
            1. Go to url "https://jobs.staffinc.co/"
            2. Click button Masuk
            3. Fill phone number
            4. Click Button Lanjut
        Test Data : 
            1. user data (Phone number that already registered)
        Expected Result : 
            1. The user stuck on verification page
            2. Show bottom sheet with information : 
                * Title : "Segera selesaikan proses verifikasi nomor telepone kamu"
                * Sub title : "Kamu telah mencapai batas percobaan OTP. ....."
                * Button "Baik, saya mengerti"

2. Element should be present : 
    * Sign up page : 
        - Element field name -> function for fill text name.
        - Element list jenis kelamin -> function for choose gender from list.
        - Element field date tanggal lahir -> function for fill date of birth information.
        - Element list province -> function to choose province from list.
        - Element list kota tempat tinggal -> function to choose city from list.
        - Element field nomor telepon -> function to fill phone number information.
        - Element checkbox syarat dan ketentuan -> function to make sure that user know the tnc.
        - Element button Lanjut -> function to submit the data and direct to verification page (next step from sign up step).
        - Element button Klik disini -> function to trigger to get otp number.
        - Element field OTP Number -> function to fill otp number.
        - Element button Lanjut -> function to submit otp number and to complete the sign up step.
    * Sign in page : 
        - Element field phone number -> fucntion to fill phone number.
        - Element button lanjut -> function to sumbit phone number to the next step.
        - Element field OTP Number -> function to fill otp number.
    * Possibility issue : 
        - Front end : 
            * Mandatory element like phone number at sign in page doesn't appear.
            * Button Lanjut can't be clickable.
            * Verification mandatory field doesn't works. Example : field email or phone number or name.
            * Field otp number become only 1 or other 4 number format.
            * button lanjut always eligible to click.
            * redirection from registered page to verification page not running well.
        - Back end : 
            * User can register using data existing or duplicate data(Failed validation existing data).
            * User can't get otp number form whatsapp.
            * User can't sign up due to service panic or connection refuse.
            * User always get same otp number after trigger to get new otp number.
            * Always can't sign due to wrong get data from db for phone number.
        - Security : 
            * User can resgitered and get otp number using invalid phone number data.
            * User can sign in using invalid phone number.
            * User can get otp number from difference phone number that already registered before.
            * User data testing reflect to production enviroment.

3. feedback regarding testability and user experiences : 
    * declare specific data-testid value for critical element for testing needs. Example : actual for button daftar and masuk get same data-testid value "testid-atom-custtom-button". Maybe, FE engineer can declare data-testid for button daftar like "btnSignUp" and button masuk "btnSignIn. This makes it easier for QA to declare elements for automation testing purposes.
    * Maybe, FE SE can setting appearance for desktop user or lite user. Make user can see every information on landing page clearly.
    * Maybe can additional feature for language version app. Indo or English mode.

Math & Logic (non-automation) : 
1. answer is at 10:10
2. Alex probability to win the game : 0.2104704 -> rounded 0.2105
3. Minimum number of sock : 4.
4. The most questions that i'll need to ask is "Are you a normal human?"


Database Query (non-automation) : 

1. Query for questionn number one : 

SELECT 
    (SELECT name FROM Employees WHERE id = e.spv) AS spv_name,
    COUNT(*) AS number_of_employees
FROM Employees e
WHERE spv IS NOT NULL
GROUP BY spv
ORDER BY spv_name;

Leadership & Organizational Skills : 
1. How will you structure your team?

- I will define roles and responsebilities to each member team clearly.
- I will create team culture based on respect, trust to each other and accountibility.
- I will create feetback mechanisms like 1on1 with each team member monthly to hear good imput for team progress and more confortable to do task day by day.
- Encourage flexibility among team members to adapt to challenges or new information.

2. In your point of view, how collaboration between Product, QA, Design, and Engineering teams should look like in order to meet optimum outcome?

- collaboration between stackholders must be more agile, open to each other, willing to accept all POV and good input.
- agree with what has been agreed upon from the beginning until the end of the project.
- disciplined with their respective tasks
- always overcome if there is blocker to achieve the goal of project.

3. What are the metrics that can be used to track the quality of product, process, and people?
 
- Product : 
    * Defect Rate: make sure that product doesn't have critical issues or bugs.
    * Customer Satisfaction : Running well for user experiences.
    * Habbit : by using this product, user can create new habbit to support that user activity. 

- Process : 
    * Cycle Time : From begining to the end project, always on track for every development, testing or pre-requirement timeline.
    * Efficiency : the project timeline is not too long and not too fast.
    * Throughput: The rate at which units of product pass through a process within a specified timeframe.

- People : 
    * Skill Competency
    * Employee Satisfaction
    * Attitude
    * Time management
    * Character