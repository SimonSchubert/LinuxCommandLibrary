# TAGLINE

privacy-focused Firefox fork with enhanced security defaults

# TLDR

**Start LibreWolf**

```librewolf```

**Open specific URL**

```librewolf [https://example.com]```

**Open in private browsing mode**

```librewolf --private-window```

**Open URL in a new window**

```librewolf --new-window [url]```

**Open URL in a new tab**

```librewolf --new-tab [url]```

**Use specific profile**

```librewolf -P [profile-name]```

**Start profile manager**

```librewolf --ProfileManager```

**Start in safe mode with add-ons disabled**

```librewolf --safe-mode```

# SYNOPSIS

**librewolf** [_options_] [_url_...]

# PARAMETERS

**--private-window**
> Open private browsing window.

**--new-window** _url_
> Open URL in new window.

**--new-tab** _url_
> Open URL in new tab.

**-P** _profile_
> Use specified profile.

**--ProfileManager**
> Open profile manager.

**--safe-mode**
> Start with add-ons disabled.

**--headless**
> Run without GUI.

**--search** _term_
> Search using default search engine.

**--screenshot** _file_
> Take screenshot of a URL (use with --headless).

# DESCRIPTION

**librewolf** is a privacy-focused Firefox fork with enhanced security defaults. Removes telemetry, includes uBlock Origin, and applies privacy-hardening configurations. Maintains Firefox compatibility while prioritizing user privacy. Since it is based on Firefox, it accepts all standard Firefox command-line options.

# SEE ALSO

[firefox](/man/firefox)(1)

