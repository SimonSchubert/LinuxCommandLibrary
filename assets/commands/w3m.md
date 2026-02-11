# TAGLINE

Text-based web browser and pager

# TLDR

**Open a URL**

```w3m [https://example.com]```

**Open a local file**

```w3m [file.html]```

**Dump page as text**

```w3m -dump [https://example.com]```

**Dump with source**

```w3m -dump_source [https://example.com]```

**Render HTML from stdin**

```cat [file.html] | w3m -T text/html```

**Open in monochrome** mode

```w3m -M [https://example.com]```

**Use specific browser width**

```w3m -cols [80] -dump [https://example.com]```

**Open bookmark file**

```w3m -B```

# SYNOPSIS

**w3m** [_options_] [_URL or file_]

# DESCRIPTION

**w3m** is a text-based web browser that runs in the terminal. It renders HTML pages with tables, frames, and images (when using appropriate terminal), making it one of the most capable terminal browsers.

The browser supports tabs, bookmarks, cookies, and form input. It can also be used as a pager (like less) for local HTML files. The -dump option makes it useful for converting HTML to plain text in scripts.

w3m handles both HTTP and HTTPS, supports basic authentication, and can work with external programs for downloading and image display.

# PARAMETERS

**-dump**
> Dump rendered page to stdout and exit.

**-dump_source**
> Dump HTML source to stdout.

**-T** _type_
> Specify content type.

**-cols** _num_
> Set display width.

**-M**
> Monochrome mode.

**-B**
> Open bookmark file.

**-m**
> Use mouse in certain terminals.

**-cookie**
> Enable cookies.

**-no-cookie**
> Disable cookies.

**-pauth** _user:pass_
> Proxy authentication.

**-o** _option=value_
> Set configuration option.

# NAVIGATION KEYS

**Space/PgDn**: Page down
**b/PgUp**: Page up
**Enter**: Follow link
**Tab**: Next link
**U**: Enter URL
**B**: Back
**H**: History
**T**: New tab
**q**: Quit

# CAVEATS

No JavaScript support. Some modern web pages won't render correctly. Image support requires compatible terminal. HTTPS may need configuration depending on SSL library.

# HISTORY

**w3m** was created by **Akinori Ito** in **1995** at Tohoku University in Japan. The name originally stood for "WWW-wo-Miru" (meaning "see WWW" in Japanese). It gained features like table rendering and image support, becoming more capable than earlier text browsers. The project has been maintained by various developers over the years.

# SEE ALSO

[lynx](/man/lynx)(1), [links](/man/links)(1), [elinks](/man/elinks)(1), [curl](/man/curl)(1)
