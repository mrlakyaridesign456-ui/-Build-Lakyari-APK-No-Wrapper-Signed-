# Lakyari Player V4.3 — Hybrid Royal Edition (GitHub-ready)

Ye repo **GitHub pe push karne** ke liye fully prepared Android Studio project pack hai.
Isme splash animation (Lottie JSON placeholder), logo assets, theme config, aur GitHub Actions workflow shamil hain.
Follow karein ye steps to produce a signed APK automatically (recommended).

## Quick Steps (Roman Urdu)
1. GitHub par account banao aur new repository create karo (e.g. `LakyariPlayerV4.3`).
2. Is folder ka saara content commit aur push kar do to `main` branch.
3. GitHub repo -> Settings -> Secrets -> add these secrets (recommended):
   - `KEYSTORE_BASE64` : aapka keystore file base64 encoded (do NOT commit keystore in repo)
   - `KEY_ALIAS` : keystore alias
   - `KEYSTORE_PASSWORD` : keystore password
   - `KEY_PASSWORD` : key password
4. Repo -> Actions tab -> run workflow named **Build and Sign Lakyari APK**.
5. Jab workflow complete ho to Actions -> artifact -> download `Lakyari_v4_3_signed.apk`.

## Local Build (agar chaho)
- Open the project in Android Studio, install SDK 34, then Build -> Generate Signed Bundle / APK (use your keystore).

## Files in this package
- `app/` : Android app module (Compose + Lottie splash integration)
- `app/src/main/res/raw/lakyari_intro.json` : placeholder Lottie animation (replace with final JSON)
- `.github/workflows/build-signed-apk.yml` : workflow to build and sign APK using secrets
- `assets/logo/` : placeholder PNG/SVG logo assets
- `README.md` : (this file) build + push instructions

Enjoy — ye structure GitHub pe push karte hi signed APK banane ke liye ready ho jaega.
