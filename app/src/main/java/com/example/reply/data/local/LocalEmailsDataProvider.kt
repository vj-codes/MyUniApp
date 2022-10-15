package com.example.reply.data.local

import com.example.reply.data.Email
import com.example.reply.data.boxType

object LocalEmailsDataProvider {
    val allEmails = mutableListOf(
        Email(
            id = 0,
            sender = LocalDataProvider.getContactAccountById(7),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Compose Camp Day 3",
            body = """
           Howdy Compose Campers!👩🏼‍💻🧑🏼‍💻

           Kudos to all who have come this far in the Android voyage 🙌🏻🥳🥳

           Here we come with Day 3 of our camping: 

           Adore the Dice Roll
           So let’s roll some dice🎲and adore its awesomeness. 

           🏃🏻‍♀️🏃🏻Don’t Forget to join us! """.trimIndent(),
            createdAt = "15th Oct, 2pm, Room 518"
        ),
        Email(
            id = 1,
            sender = LocalDataProvider.getContactAccountById(4),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Engineers Day Celebration",
            body = """
            Every year India celebrates National Engineer's day on September 15
             
            to recognise and honour the achievements of the great engineer Mokshagundam Visvesvaraya. Along with India, Visvesvaraya's great works are also celebrated in Sri Lanka and Tanzania on September 15 as Engineer's day.
       """.trimIndent(),
            createdAt = "10th October, 11am",
        ),
        Email(
            id = 2,
            sender = LocalDataProvider.getContactAccountById(11),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Induction Program",
            body = """
          📢 Greetings curious minds!

          💥The wait is finally over!!💥
          🤖| MESCOE ROBOCLUB |🤖 is thrilled to announce our induction program 2022. 

          ✨ Be a part of this session & we will come across ....
          🔸️What is Roboclub?🤔
          🔸️Our vision and mission🎯
          🔹️What is Robocon?❗
          🔸️Benefits and Opportunities in all aspects
          🔹️Our upcoming grand event🎉
          And many more things ...

          🎊We are excited to inaugurate our new logo of MESCOE ROBOCLUB 🎉
          And also there is surprises for you guys so come and join us on!
       """.trimIndent(),
            createdAt = "5th October, 1pm, Room 303",
        ),
        Email(
            id = 3,
            sender = LocalDataProvider.userAccount,
            recipients = listOf(
                LocalDataProvider.getContactAccountById(11),
                LocalDataProvider.getContactAccountById(3)
            ),
            subject = "Robo Club",
            body = """
          ROBOTICS CLUB (ROBOCLUB) is a Students' Association of Modern Education Society's College of Engineering, Pune. MESCOE has founded the ROBOCLUB in the year 2007. ROBOCLUB is a Co-curricular activity that aims to engage students with a fun and enjoyable way of learning new skills as well as to cultivate leadership and entrepreneurship capabilities.
           Robotics consists of design, construction, operation, and application of robots with computer based control systems, sensory feedback systems and information gathering and processing. The overall design of a robotic systems employs together principles of electronic engineering, mechanical engineering and computer engineering. The study of robots is interdisciplinary in nature. The club provides the opportunities for students from various engineering disciplines to work together, share their individual expertise. Working in group permits the students from different domain to work together for solving problems that require skills from varied discipline.
       """.trimIndent(),
            createdAt = "2 hours ago",
            mailbox = boxType.Lectures,
        ),
        Email(
            id = 4,
            sender = LocalDataProvider.getContactAccountById(9),
            recipients = listOf(
                LocalDataProvider.userAccount,
                LocalDataProvider.getContactAccountById(6),
                LocalDataProvider.getContactAccountById(3)
            ),
            subject = "Certificate Distribution",
            body = """
           Morning folksss!
           
           We cordially invite all of you for the certificate distribution ceremony of -
       """.trimIndent(),
            createdAt = "31st September, 8am, Room 101",
        ),
        Email(
            id = 5,
            sender = LocalDataProvider.userAccount,
            recipients = listOf(LocalDataProvider.getContactAccountById(11)),
            "Object Oriented Programming",
            createdAt = "8am - 8:50pm",
            mailbox = boxType.Clubs
        ),
        Email(
            id = 7,
            sender = LocalDataProvider.userAccount,
            recipients = listOf(LocalDataProvider.getContactAccountById(11)),
            "Discrete Mathematics",
            "",
            createdAt = "9am - 9:50am",
            mailbox = boxType.Clubs
        ),
        Email(
            id = 9,
            sender = LocalDataProvider.userAccount,
            recipients = listOf(LocalDataProvider.getContactAccountById(11)),
            "Data Structure Lab",
            "",
            createdAt = "2pm - 3:50pm",
            mailbox = boxType.Clubs
        ),
        Email(
            id = 1,
            sender = LocalDataProvider.userAccount,
            recipients = listOf(LocalDataProvider.getContactAccountById(11)),
            subject = "GDSC MESCOE",
            body = """
          Google Developer Student Clubs(DSCs) are community groups for college and university students interested in Google developer technologies. It allows students to try new ideas and collaborate to solve mobile and web development problems,machine learning and cloud skills. Students from all undergraduate or graduate programs with an interest in growing as a developer are welcome.
       """.trimIndent(),
            createdAt = "2 hours ago",
            mailbox = boxType.Lectures,
        ),
        Email(
            id = 21,
            sender = LocalDataProvider.getContactAccountById(12),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Assignment 1",
            body = """ """.trimIndent(),
            createdAt = "3 hours ago",
            mailbox = boxType.Assignments,
        ),
        Email(
            id = 20,
            sender = LocalDataProvider.getContactAccountById(12),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Assignment 2",
            body = """ """.trimIndent(),
            createdAt = "Pending",
            mailbox = boxType.Assignments,
        ),
        Email(
            id = 19,
            sender = LocalDataProvider.getContactAccountById(12),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Open Book Test",
            body = """ """.trimIndent(),
            createdAt = "Done",
            mailbox = boxType.Assignments,
        ),
        Email(
            id = 18,
            sender = LocalDataProvider.getContactAccountById(12),
            recipients = listOf(LocalDataProvider.userAccount),
            subject = "Assignment 3",
            body = """ """.trimIndent(),
            createdAt = "Submitted",
            mailbox = boxType.Assignments,
        ),
    )

    val defaultEmail = Email(
        id = -1,
        sender = LocalDataProvider.defaultAccount,
        createdAt = ""
    )
}
