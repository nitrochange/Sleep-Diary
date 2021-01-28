[![official JetBrains project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

# Sleep Diary Web Full Stack app

This repository is the code corresponding to the hands-on lab [Building a Full Stack Web App with Kotlin Multiplatform](https://play.kotlinlang.org/hands-on/Full%20Stack%20Web%20App%20with%20Kotlin%20Multiplatform/).

Основная идея данного проекта - создать клиент-серверное приложение, базирущееся на туториале [Building a Full Stack Web App with Kotlin Multiplatform] 
и являющееся рекомедательной системой, которая основываясь на данных о сне человека, формулирует четкие рекомендации по улучшению качества жизни.


Архитектурно проект будет разделяться на несколько модулей и далее каждый из них будет подробно описан

#Recommendation module 

В некотором смысле ядро проекта, представляющее собой рекомендательную систему, 
написанную на недавно вышедшей библиотеке глубокого обучения KotlinDL. 
Реализует в себе несколько разных с точки зрения архитектуры рекомендательных алгоритмов, 
которые будут применяться для разного типа данных.

#Persistance layer

Слой, полностью отвечающий за работу непосредственно с базой данных. Никакие другие части проекта не имеют права делать 
запросы в БД. В качестве БД выбрана Oracle в силу того, что по некоторым исследованиям NoSQL базы данных менее устойчивы 
к различного рода атака  