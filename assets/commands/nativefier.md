# TAGLINE

wraps websites as desktop applications using Electron

# TLDR

**Create app from website**

```nativefier "[https://example.com]"```

**Create with custom name**

```nativefier --name "[App Name]" "[https://example.com]"```

**Create with custom icon**

```nativefier --icon [icon.png] "[https://example.com]"```

**Create in specific directory**

```nativefier "[https://example.com]" [/output/dir]```

**Create with tray icon**

```nativefier --tray "[https://example.com]"```

**Create maximized window**

```nativefier --maximize "[https://example.com]"```

**Create single instance app**

```nativefier --single-instance "[https://example.com]"```

**Create with injected CSS** or JavaScript (repeatable)

```nativefier --inject [style.css] --inject [script.js] "[https://example.com]"```

Build for **another platform** and architecture

```nativefier --platform [windows] --arch [x64] "[https://example.com]"```

Keep **login and OAuth pages** inside the app

```nativefier --internal-urls "[.*?\.example\.com.*?]" "[https://example.com]"```

**Upgrade** an existing app to the latest Electron, keeping its options

```nativefier --upgrade [path/to/App-linux-x64]```

# SYNOPSIS

**nativefier** [_options_] _url_ [_output_dir_]

**nativefier** **--upgrade** _app_path_ [_options_]

# PARAMETERS

**-n**, **--name** _NAME_
> Application name.

**-i**, **--icon** _PATH_
> Custom icon file (.png on Linux, .ico on Windows, .icns on macOS).

**-p**, **--platform** _OS_
> Target platform (mac, windows, linux).

**-a**, **--arch** _ARCH_
> Target architecture.

**-e**, **--electron-version** _VERSION_
> Electron version to bundle.

**--upgrade** _PATH_
> Rebuild an existing app in place, reusing its options.

**--tray** [**start-in-tray**]
> Add system tray icon; optionally start hidden in the tray.

**--width**, **--height** _PIXELS_
> Initial window size (default 1280x800).

**--full-screen**
> Start in full screen.

**--maximize**
> Start maximized.

**--single-instance**
> Only one instance allowed.

**--inject** _FILE_
> Inject CSS or JavaScript.

**-u**, **--user-agent** _STRING_
> Custom user agent, or a preset such as **firefox** or **safari**.

**-m**, **--show-menu-bar**
> Show the menu bar.

**-c**, **--conceal**
> Pack the app source into an asar archive.

**--portable**
> Store user data (cookies, cache) next to the app.

**--counter**
> Show the count from the page title on the dock/taskbar icon.

**--internal-urls** _REGEX_
> URLs to open internally.

**--file-download-options** _JSON_
> Download behavior settings.

**--disable-context-menu**
> Disable right-click menu.

**--widevine**
> Enable Widevine DRM.

# DESCRIPTION

**nativefier** wraps websites as desktop applications using Electron. The result is a standalone app that behaves like a native application.

Applications get their own window, dock/taskbar icon, and can run independently of browsers. This is useful for web apps that benefit from dedicated window management.

Custom icons, names, and window behavior make apps feel native. Tray mode minimizes to system tray. Single instance prevents multiple copies.

CSS and JavaScript injection modifies the wrapped site. This can customize appearance, add features, or remove unwanted elements.

Internal URL patterns control which links open in the app versus the default browser. This keeps the app focused on its core functionality.

Platform targeting creates apps for Windows, macOS, or Linux from any development machine.

# CAVEATS

Electron apps are large (100MB+) and bundle a Chromium that no longer receives updates once built; rebuild regularly with **--upgrade** for security fixes. Some sites (e.g. Google sign-in) block embedded browsers. The **--flash** option was removed in v43. The project is **unmaintained and archived** (2023); consider alternatives such as Pake or the browser's own "install as app" feature.

# HISTORY

**nativefier** was created by **Jia Hao Gao** around **2015** to easily create desktop apps from web pages. It became popular for wrapping services like Slack, WhatsApp Web, and internal tools. After its maintainers stepped back, the GitHub repository was **archived in 2023** and no further releases are made.

# SEE ALSO

[electron](/man/electron)(1), [pake](/man/pake)(1), [pwa](/man/pwa)(1)

# RESOURCES

```[Source code](https://github.com/nativefier/nativefier)```

```[Documentation](https://github.com/nativefier/nativefier/blob/master/API.md)```

<!-- verified: 2026-09-29 -->
