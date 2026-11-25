<div align="center">

<p align="center"><img src="docs/icon.png" alt="VictorRecovery Companion icon" width="160"></p>

# VictorRecovery Companion

**Android companion app for VictorRecovery (experimental skeleton).**

<p>
  <a href="https://github.com/Victorious93/VictorRecovery-Companion/actions/workflows/build-debug.yml"><img src="https://img.shields.io/github/actions/workflow/status/Victorious93/VictorRecovery-Companion/build-debug.yml?branch=main&style=flat-square&labelColor=0B0F1A&logo=githubactions&logoColor=00E5FF&label=CI" alt="CI"/></a>
  <img src="https://img.shields.io/badge/license-Apache--2.0-FF2BD6?style=flat-square&labelColor=0B0F1A" alt="License"/>
  <img src="https://img.shields.io/badge/platform-Android-00E5FF?style=flat-square&labelColor=0B0F1A" alt="Platform"/>
  <a href="https://victorious-framework.pages.dev"><img src="https://img.shields.io/badge/Victorious-Framework-FF2BD6?style=flat-square&labelColor=0B0F1A" alt="Victorious Framework"/></a>
</p>

<p><a href="https://victorious-framework.pages.dev">Victorious Framework</a></p>

</div>

---

Android companion app for [VictorRecovery](https://github.com/Victorious93/VictorRecovery): install/update the recovery, schedule backups, build flash lists, and browse backups. Package id: `com.victorious.recovery`.

> **Status: experimental skeleton.** It only shows a themed start screen. No recovery features exist yet and nothing has been tested on a device.
>
> ⚠️ **Flashing can brick your phone.** It needs an unlocked bootloader (unlocking **erases all data** and may void the warranty). Back up first. Use at your own risk, no warranty.

## Build
`./gradlew assembleDebug` (JDK 17, Android SDK 34). The APK is `app/build/outputs/apk/debug/`.

## Signing (debug)
CI signs the debug APK with this project's **own fixed debug keystore**. The keystore is never in the repo. It is stored as the Actions secrets `KEYSTORE_BASE64`, `KEYSTORE_PASSWORD`, `KEY_ALIAS` and `KEY_PASSWORD`, and decoded at build time. Local builds without those variables use the default Android debug key. A debug key is not a release key: release signing will use a separate key.

## Theme
Dark neon: background `#0B0F1A`, cyan `#00E5FF`, magenta `#FF2BD6`.

---

## Victorious fleet

VictorRecovery Companion is part of the [Victorious Framework](https://victorious-framework.pages.dev), a family of Android and PC tools by Don Victor. **Every app works standalone; fleet integrations are optional** and never required.

Related: [VictorRecovery](https://github.com/Victorious93/VictorRecovery) (custom recovery), [VictorLaunch](https://github.com/Victorious93/victorlaunch) (fleet launcher and theme provider), [droidcommand-AI](https://github.com/Victorious93/droidcommand-AI) (fleet controller). The full roster lives in [victorious-fleet](https://github.com/Victorious93/victorious-fleet), and live status is in [fleet-manifest](https://github.com/Victorious93/fleet-manifest).

## Contributing

Issues and pull requests are welcome. Keep changes focused, match the existing code style, never commit secrets or release keys, and keep any fleet integration optional so the app still works on its own. Open a PR against the default branch and wait for CI to pass.

## Licence
Apache-2.0, see [LICENSE](LICENSE) and [NOTICE](NOTICE).
