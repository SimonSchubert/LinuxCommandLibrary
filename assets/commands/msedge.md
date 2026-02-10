# TAGLINE

launches Microsoft Edge browser from command line

# TLDR

**Open Microsoft Edge**

```msedge```

**Open URL**

```msedge [https://example.com]```

**Open in new window**

```msedge --new-window [https://example.com]```

**Open in incognito mode**

```msedge --inprivate [https://example.com]```

**Open with developer tools**

```msedge --auto-open-devtools-for-tabs [https://example.com]```

# SYNOPSIS

**msedge** [_options_] [_url_...]

# PARAMETERS

**--new-window**
> Open in new window.

**--inprivate**
> Open in InPrivate mode.

**--profile-directory** _name_
> Use specific profile.

**--auto-open-devtools-for-tabs**
> Open DevTools automatically.

**--headless**
> Run in headless mode.

**--disable-gpu**
> Disable GPU hardware acceleration.

**--user-data-dir** _path_
> Custom user data directory.

# DESCRIPTION

**msedge** launches Microsoft Edge browser from command line. Chromium-based browser with full compatibility for Chrome flags and options. Supports automation, debugging, and testing scenarios.

# SEE ALSO

[google-chrome](/man/google-chrome)(1), [firefox](/man/firefox)(1), [chromium](/man/chromium)(1)

