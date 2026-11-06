# MIS 571 Group 1 — Vendor Audit Tracking

Starter repository for the MIS 571 Group 1 Vendor Audit and Qualification Tracking System. The project is primarily an Android Studio app using SQLite on the device.

## Repository layout

- `android/` — Android Studio project (Kotlin) with a starter SQLite database.
- `Src/MIS 571_Group 1_Milestone_1.docx` — business problem and expected tables.
- `Src/Project Milestone 2.docx` — conceptual database design and milestone deliverable.
- `Src/Mockup Data(Mockup Data).csv` — sample vendor audit data for local development and database testing.
- The `.url` files in the repository root are SharePoint shortcuts to the original course files; access may require a WPI account.

The app is intended to track vendors, audits, employee responsibilities, IT/QA/cybersecurity reviews, findings, and final qualification. Use the milestone documents as the source of truth for refining the SQLite schema; the starter database is intentionally only a placeholder.

## Android app

Open the `android/` folder in Android Studio, allow Gradle sync to finish, then run the `app` configuration on an emulator or device. The starter screen opens the SQLite database in `android/app/src/main/java/edu/wpi/mis571/data/AppDatabase.kt`.

The `records` table is only a placeholder. Replace it with the schema and migrations required by the project milestones before adding project features. Do not store credentials or personal data in the repository.

## Project workflow

1. Review the milestone documents and mockup data in `Src/`; use the SharePoint shortcuts if you need the originals.
2. Record the approved requirements, data model, and division of work in the appropriate course deliverable before replacing starter placeholders.
3. Keep Android app code and SQLite schema/migrations in `android/`.
4. Do not commit generated build output, local databases, secrets, or private datasets.
