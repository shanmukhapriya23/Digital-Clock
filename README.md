# Task 25: Digital Clock Application

A simple Android application built with **Kotlin** that displays the current time in real-time and automatically updates every second using time-based UI updates.

---

## 📌 Project Overview
* **Track:** Android Development Track[cite: 1]
* **Level & Day:** Level 1 • Day 25[cite: 1]
* **Language:** Kotlin[cite: 1]
* **IDE:** Android Studio[cite: 1]

---

## 🎯 Objectives & Learning Outcomes
* Understand **time-based UI updates** in Android[cite: 1].
* Implement periodic tasks using **Handler** and **Runnable**[cite: 1].
* Format dates and times dynamically using `SimpleDateFormat` and Android time/date APIs[cite: 1].
* Manage background resource usage by pausing updates in `onPause()` and resuming in `onResume()`.

---

## 🚀 Features
* **Real-time Digital Clock:** Continuously updates seconds, minutes, and hours automatically[cite: 1].
* **Resource Efficient:** Handler callbacks are cleared when the app is in the background to prevent memory leaks and save battery.
* **Modern UI:** Clean digital layout styled with dynamic contrast colors[cite: 1].

---

## 🛠️ Tools & Technologies
* **Android Studio**[cite: 1]
* **Kotlin**[cite: 1]
* **Android SDK Time APIs** (`SimpleDateFormat`, `Date`, `Locale`)[cite: 1]
* **Handler & Looper** for main-thread UI execution[cite: 1]

---

## 💡 Interview Questions Addressed
1. **How can Android update UI periodically?**[cite: 1]
   * Android can update the UI periodically using mechanisms like a `Handler` with `postDelayed()`, `Timer` / `TimerTask`, `RxJava` interval operators, or `Kotlin Coroutines` (`delay()` inside a loop).
2. **What is a Handler?**[cite: 1]
   * A `Handler` is an Android component bound to a thread's `Looper`. It allows sending and processing `Message` and `Runnable` objects associated with a thread's message queue, commonly used to execute or schedule code on the Main UI thread.

---

## 📂 Project Structure
```text
DigitalClock/
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/digitalclock/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   └── layout/
│   │   │   │       └── activity_main.xml
│   │   │   └── AndroidManifest.xml
