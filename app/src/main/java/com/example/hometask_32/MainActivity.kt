package com.example.hometask_32

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNewsList.adapter = NewsAdapter(getNews(), this)
        rvNewsList.layoutManager = LinearLayoutManager(this)

    }


    private fun getNews(): ArrayList<News> {
        val listOfNews = ArrayList<News>()
        listOfNews.add(News(
            "COP26: Thousands march for Glasgow's biggest protest",
            "About 100,000 people marched in Glasgow to demand more action on the climate crisis, organisers have said",
            BitmapFactory.decodeResource(resources, R.drawable.news1)

        ))
        listOfNews.add(News(
            "Climate change: The US state taking on an oil giant for greenwashing",
            "AThe question of responsibility for the effects of global warming is - slowly - being tested in court. One case in Massachusetts is using consumer laws to take on oil giant ExxonMobil. If the US state wins, it will be the first case \n" +
                    "in the world to successfully prosecute a fossil fuel company for greenwashing and misleading the public",
            BitmapFactory.decodeResource(resources, R.drawable.news2)

        ))
        listOfNews.add(News(
            "Greta Thunberg: Who is the climate campaigner and what are her aims?",
            "Thunberg became well-known after she protested outside the Swedish parliament in 2018, when she was 15. She held a sign saying 'School Strike for Climate', to pressure the government to meet carbon emissions targets",
            BitmapFactory.decodeResource(resources, R.drawable.news3)

        ))
        listOfNews.add(News(
            "Deng Deng, the abandoned Shiba Inu, sells for $25k at auction in China",
            "The Shiba Inu called Deng Deng had been left at a pet training centre seven years ago and his owner never returned. A Beijing court ordered the eight-year-old dog be put up for auction after the owner could not be located",
            BitmapFactory.decodeResource(resources, R.drawable.news4)

        ))
        listOfNews.add(News(
            "Revealed: The Cryptoqueen's £13.5m London penthouse",
            "A money-laundering trial in Germany is shining a light on the purchase of a luxury London penthouse by cryptocurrency scammer Dr Ruja Ignatova. \n" +
                    "Jamie Bartlett and Rob Byrne of The Missing Cryptoqueen podcast explain how she used British-based lawyers and wealth managers - who continued to offer their services after she disappeared",
            BitmapFactory.decodeResource(resources, R.drawable.news5)

        ))
        listOfNews.add(News(
            "Abba on new album Voyage: We don't need to prove anything",
            "As Abba release their first studio album for 40 years, Voyage, Benny Andersson and Bjorn Ulvaeus speak to the BBC about being compared to their old music and why you won't be seeing Agnetha and Anni-Frid",
            BitmapFactory.decodeResource(resources, R.drawable.news6)

        ))
        listOfNews.add(News(
            "'By helping out delegates I'm remembering granddad'",
            "Harjot Singh Kambo is one of an army of volunteers helping COP26 visitors find their way around. In the latest of a series of first-person accounts from the summit, he explains why the task is a very personal one for him.\n" +
                    "I'm one of 1,000 COP26 volunteers scattered around Glasgow and Edinburgh. Today I did the morning shift from 07:30 to 10:30, standing at Buchanan Bus Station to welcome delegates from around the world",
            BitmapFactory.decodeResource(resources, R.drawable.news7)

        ))
        listOfNews.add(News(
            "COP26: Thousands march for Glasgow's biggest protest",
            "About 100,000 people marched in Glasgow to demand more action on the climate crisis, organisers have said",
            BitmapFactory.decodeResource(resources, R.drawable.news1)

        ))
        listOfNews.add(News(
            "Climate change: The US state taking on an oil giant for greenwashing",
            "AThe question of responsibility for the effects of global warming is - slowly - being tested in court. One case in Massachusetts is using consumer laws to take on oil giant ExxonMobil. If the US state wins, it will be the first case \n" +
                    "in the world to successfully prosecute a fossil fuel company for greenwashing and misleading the public",
            BitmapFactory.decodeResource(resources, R.drawable.news2)

        ))
        listOfNews.add(News(
            "Greta Thunberg: Who is the climate campaigner and what are her aims?",
            "Thunberg became well-known after she protested outside the Swedish parliament in 2018, when she was 15. She held a sign saying 'School Strike for Climate', to pressure the government to meet carbon emissions targets",
            BitmapFactory.decodeResource(resources, R.drawable.news3)

        ))
        listOfNews.add(News(
            "Deng Deng, the abandoned Shiba Inu, sells for $25k at auction in China",
            "The Shiba Inu called Deng Deng had been left at a pet training centre seven years ago and his owner never returned. A Beijing court ordered the eight-year-old dog be put up for auction after the owner could not be located",
            BitmapFactory.decodeResource(resources, R.drawable.news4)

        ))
        listOfNews.add(News(
            "Revealed: The Cryptoqueen's £13.5m London penthouse",
            "A money-laundering trial in Germany is shining a light on the purchase of a luxury London penthouse by cryptocurrency scammer Dr Ruja Ignatova. \n" +
                    "Jamie Bartlett and Rob Byrne of The Missing Cryptoqueen podcast explain how she used British-based lawyers and wealth managers - who continued to offer their services after she disappeared",
            BitmapFactory.decodeResource(resources, R.drawable.news5)

        ))
        listOfNews.add(News(
            "Abba on new album Voyage: We don't need to prove anything",
            "As Abba release their first studio album for 40 years, Voyage, Benny Andersson and Bjorn Ulvaeus speak to the BBC about being compared to their old music and why you won't be seeing Agnetha and Anni-Frid",
            BitmapFactory.decodeResource(resources, R.drawable.news6)

        ))
        listOfNews.add(News(
            "'By helping out delegates I'm remembering granddad'",
            "Harjot Singh Kambo is one of an army of volunteers helping COP26 visitors find their way around. In the latest of a series of first-person accounts from the summit, he explains why the task is a very personal one for him.\n" +
                    "I'm one of 1,000 COP26 volunteers scattered around Glasgow and Edinburgh. Today I did the morning shift from 07:30 to 10:30, standing at Buchanan Bus Station to welcome delegates from around the world",
            BitmapFactory.decodeResource(resources, R.drawable.news7)

        ))

        return listOfNews
    }


}