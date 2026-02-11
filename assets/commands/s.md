# TAGLINE

Web search from the terminal

# TLDR

**Search the web** using the default provider (presearch)

```s [query]```

**Search using a specific provider** like Google

```s -p google [query]```

**Search Amazon** for a product

```s -p amazon [wireless keyboard]```

**Search providers by tag** (e.g., video sites)

```s -t video [query]```

**List all available** search providers

```s -l```

**Output the search URL** without opening a browser

```s -o [query]```

**Search using a specific browser** application

```s -b "[firefox --private-window]" [query]```

**Start the web server** interface

```s -s --port [8080]```

# SYNOPSIS

**s** [_options_] [_query_]

# PARAMETERS

**-p**, **--provider** _name_
> Specify the search provider (default: presearch). Supports partial matching.

**-t**, **--tag** _tag_
> Search using providers filtered by tag (e.g., video, images, code)

**-b**, **--binary** _path_
> Browser or application to open search results

**-o**, **--output**
> Output-only mode; prints the URL without launching a browser

**-l**, **--list-providers**
> Display all available search providers

**--list-tags**
> Display available tag categories

**-s**, **--server**
> Launch the web server interface for browser-based searching

**--port** _number_
> Server port number (default: 8080)

**-c**, **--cert** _file_
> Path to TLS certificate file for server mode

**-k**, **--key** _file_
> Path to TLS key file for server mode

**-v**, **--verbose**
> Enable verbose output

**--completion** _shell_
> Generate shell completion scripts (bash, zsh, fish)

**--version**
> Display version information

# DESCRIPTION

**s** is a command-line tool for performing web searches directly from the terminal. It opens search results in your default browser, supporting over 100 providers including Google, DuckDuckGo, Wikipedia, YouTube, GitHub, Amazon, Reddit, and Stack Overflow.

The tool supports partial name matching for providers, allowing shortcuts like **s -p g query** for Google. Providers can be filtered by tags such as **video**, **images**, or **code** to search multiple related sites at once.

Configuration is stored in **~/.config/s/config** using UCL format. You can set default providers, blacklist/whitelist providers, define custom providers, and configure browser preferences.

# CAVEATS

The **s** command requires a browser to display results. In headless environments, use **-o** to output URLs instead. Provider availability depends on the installed version; some providers may change or become unavailable over time.

# HISTORY

**s** was created by **Josh Ellithorpe** (zquestz) and first released on **GitHub** around **2016**. It is written in **Go** and designed to streamline web searches from developer workflows. The project has grown to support over 100 search providers.

# SEE ALSO

[ddgr](/man/ddgr)(1), [googler](/man/googler)(1), [surfraw](/man/surfraw)(1)
