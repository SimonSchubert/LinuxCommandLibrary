# TAGLINE

lightweight web browser

# TLDR

**Open browser**

```midori```

**Open URL**

```midori [https://example.com]```

**Open a private window**

```midori --private-window [https://example.com]```

**Open URL in a new window**

```midori --new-window [https://example.com]```

**Open URL in a new tab** of the running instance

```midori --new-tab [https://example.com]```

**Open a local file**

```midori [file.html]```

**Choose a profile** with the profile manager

```midori -P```

# SYNOPSIS

**midori** [_options_] [_urls_]

# PARAMETERS

_URLS_
> URLs or files to open.

**--private-window** [_url_]
> Open a private browsing window.

**--new-window** _url_
> Open the URL in a new window.

**--new-tab** _url_
> Open the URL in a new tab.

**-P** [_profile_], **--ProfileManager**
> Start with the given profile, or open the profile manager.

**--kiosk**
> Start in kiosk (fullscreen, no UI) mode.

**--safe-mode**
> Start with extensions disabled.

**--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**midori** is a lightweight, privacy-focused web browser developed by **Astian**. Current versions (11 and later) are based on **Mozilla Firefox** and its **Gecko** engine, and support Firefox WebExtensions, workspaces and a built-in tracking protection extension. Because of this, command-line options follow Firefox conventions.

Older releases (up to 9.x) were a GTK browser built on **WebKitGTK** and used different options such as **-p**/**--private**, **-a**/**--app** _address_ (web application mode) and **-e**/**--execute** _command_.

# CAVEATS

The switch from WebKitGTK to Gecko in **2023** changed the engine, settings and command-line options; scripts written for Midori 9 or earlier will not work unchanged. Distribution packages may still ship the old WebKitGTK version; current builds come from Astian's own repository or downloads.

# HISTORY

Midori was created by **Christian Dywan** in **2007** as a lightweight **GTK+** and WebKit browser hosted by the Xfce project and used as the default browser of distributions such as elementary OS and Bodhi Linux. In **2019** the project merged into **Astian**, which rebuilt it on Firefox/Gecko with Midori 11 in **October 2023**.

# SEE ALSO

[firefox](/man/firefox)(1), [surf](/man/surf)(1)

# RESOURCES

```[Source code](https://github.com/goastian/midori-desktop)```

```[Homepage](https://astian.org/midori-browser/)```

<!-- verified: 2026-11-23 -->
