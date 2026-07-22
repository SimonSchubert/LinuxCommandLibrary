# TAGLINE

Search and download iOS App Store IPA packages from the command line

# TLDR

**Log in** to the App Store

```ipatool auth login```

**Show** current account info

```ipatool auth info```

**Search** for an app

```ipatool search "[term]"```

**Download** an app by bundle identifier

```ipatool download -b [com.example.app]```

**Purchase** an app (if required before download)

```ipatool purchase -b [com.example.app]```

**JSON output** for scripting

```ipatool search "[term]" --format json```

# SYNOPSIS

**ipatool** *command* [*options*]

# DESCRIPTION

**ipatool** is a command-line client for the iOS (and tvOS) App Store. After authenticating with Apple ID credentials, you can search the store, purchase apps when needed, and download **.ipa** packages for devices or tooling workflows. It is commonly used for automation, archiving, and reverse-engineering research—not as a substitute for official App Store installation on a phone.

Global options control output format and interactivity. Subcommands cover **auth**, **search**, **download**, **purchase**, and related operations; run **ipatool** *command* **--help** for full flags.

# PARAMETERS

**auth login** | **auth info** | **auth revoke**

> Manage App Store session credentials.

**search** *term*

> Search iOS/tvOS apps. **-l**, **--limit** caps results; **--platform** selects **iphone**, **ipad**, or **appletv**.

**download**

> Download an IPA (typically **-b** / **--bundle-identifier**). See **--help** for version and output options.

**purchase**

> Purchase an app so it can be downloaded with the current account.

**--format** *text*|*json*

> Output format (default: text).

**--non-interactive**

> Do not prompt; fail if input would be required.

**--verbose**

> Verbose logging.

**-h**, **--help**

> Help for the command or subcommand.

# CAVEATS

Requires a valid Apple ID and compliance with Apple's terms. Some apps are region-locked, paid, or refuse bulk download. IPAs obtained this way are not sideloadable onto stock iOS without additional signing tooling. Do not use for piracy.

# INSTALL

```brew: brew install ipatool```

```nix: nix profile install nixpkgs#ipatool```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ideviceinstaller](/man/ideviceinstaller)(1), [ios-deploy](/man/ios-deploy)(1)

# RESOURCES

```[Source code](https://github.com/majd/ipatool)```

<!-- verified: 2026-07-19 -->
