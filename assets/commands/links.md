# TAGLINE

text-mode web browser for the terminal

# TLDR

**Visit** a website

```links https://example.com```

Browse in **anonymous** mode

```links -anonymous https://example.com```

**Enable cookies**

```links -enable-cookies 1 https://example.com```

# SYNOPSIS

**links** [_options_] [_url_]

# DESCRIPTION

**links** is a text-mode web browser for the terminal. It supports tables, frames, and basic forms rendering, making it useful for browsing documentation or using the web from servers without a graphical environment.

# PARAMETERS

**-anonymous**
> Apply restrictions for anonymous browsing

**-enable-cookies 0|1**
> Enable (1) or disable (0) cookies

**-dump**
> Write rendered page to stdout

**-source**
> Write page source to stdout

**-html-margin WIDTH**
> Set margin width

# NAVIGATION KEYS

**Up/Down**
> Navigate between links

**Left/Right**
> Go back/forward in history

**Enter**
> Follow selected link

**q, y**
> Quit browser

**g**
> Go to URL

# SEE ALSO

[links2](/man/links2)(1), [lynx](/man/lynx)(1), [w3m](/man/w3m)(1)
