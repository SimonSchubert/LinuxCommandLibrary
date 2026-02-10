# TAGLINE

launches the Opera web browser, a Chromium-based browser with built-in

# TLDR

Open **Opera browser**

```opera-stable```

Open a **specific URL**

```opera-stable [https://example.com]```

Open in **incognito mode**

```opera-stable --private```

Open with a **specific profile**

```opera-stable --profile-directory="[Profile Name]"```

# SYNOPSIS

**opera-stable** [_options_] [_URL_...]

# PARAMETERS

**--private**
> Open in private browsing mode

**--new-window**
> Open URL in a new window

**--incognito**
> Alias for private mode

**--profile-directory=**_name_
> Use specified profile directory

**--disable-extensions**
> Start with extensions disabled

**--disable-gpu**
> Disable GPU hardware acceleration

**--no-sandbox**
> Disable sandbox mode (not recommended)

**--user-data-dir=**_path_
> Set custom user data directory

**--proxy-server=**_proxy_
> Use specified proxy server

**--version**
> Display version information

# DESCRIPTION

**opera-stable** launches the Opera web browser, a Chromium-based browser with built-in features like ad blocking, free VPN, and a customizable sidebar. As a Chromium derivative, it supports most Chrome command-line flags and extensions from the Chrome Web Store.

Opera includes unique features such as Flow (for syncing between devices), Workspaces (tab organization), and integrated messaging sidebars for social platforms. The stable release is the production-ready version, as opposed to beta or developer editions.

# CAVEATS

Command-line options follow Chromium conventions. Some Chrome flags may not work identically. The built-in VPN is a proxy service, not a full VPN. Running with **--no-sandbox** significantly reduces security.

# HISTORY

Opera was originally developed in **1995** by Telenor in Norway, making it one of the oldest web browsers still in active development. In **2013**, Opera switched from its proprietary Presto engine to Chromium/Blink. The browser was acquired by a Chinese consortium in **2016** and continues development as Opera Software.

# SEE ALSO

[chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1), [vivaldi-stable](/man/vivaldi-stable)(1)
