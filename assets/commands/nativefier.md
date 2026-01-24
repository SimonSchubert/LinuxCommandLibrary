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

**Create with injected CSS**

```nativefier --inject [style.css] "[https://example.com]"```

# SYNOPSIS

**nativefier** [_--name name_] [_--icon path_] [_--tray_] [_options_] _url_ [_output_dir_]

# PARAMETERS

**--name** _NAME_
> Application name.

**--icon** _PATH_
> Custom icon file.

**-p**, **--platform** _OS_
> Target platform (mac, windows, linux).

**-a**, **--arch** _ARCH_
> Target architecture.

**--tray**
> Add system tray icon.

**--maximize**
> Start maximized.

**--single-instance**
> Only one instance allowed.

**--inject** _FILE_
> Inject CSS or JavaScript.

**--user-agent** _STRING_
> Custom user agent.

**--internal-urls** _REGEX_
> URLs to open internally.

**--file-download-options** _JSON_
> Download behavior settings.

**--disable-context-menu**
> Disable right-click menu.

**--flash**
> Enable Flash plugin.

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

Electron apps are large (100MB+). Security depends on wrapped site. Flash support deprecated. Some sites detect and block embedding. Project is in maintenance mode.

# HISTORY

**nativefier** was created by **Jia Hao Gao** around **2015** to easily create desktop apps from web pages. It became popular for wrapping services like Slack, WhatsApp Web, and internal tools. The project is now in maintenance mode with limited updates.

# SEE ALSO

[electron](/man/electron)(1), [pwa](/man/pwa)(1)
