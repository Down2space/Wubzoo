# Wubzoo (Android)

Hum a melody and it plays back as a wobbling, growling dubstep kazoo. Record with the phone mic, tweak, and save WAV or MIDI to `Downloads/Wubzoo`.

## Build the APK on GitHub (no Android Studio needed)

1. On github.com: New repository → name it `Wubzoo` → Create.
2. On the new repo page: "uploading an existing file" → drag in everything INSIDE this folder (including the `.github` folder) → Commit changes.
3. Open the Actions tab. "Build APK" starts on its own (about 5–10 min). A green check means it's done.
4. On your phone, download: `https://github.com/<your-name>/Wubzoo/releases/download/latest/Wubzoo.apk`
5. Open it and allow "install unknown apps". On first launch, tap Allow for the microphone.

If the run fails (red X), open it, copy the error lines from "Build debug APK", and paste them to Claude.
The key in `debug-signing/` is a development key, fine for your own phone but not for the Play Store.
