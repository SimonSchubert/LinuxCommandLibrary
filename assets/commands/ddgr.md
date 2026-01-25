# TLDR

**Search DuckDuckGo** from the terminal

```ddgr [search terms]```

**Open the first result** directly in browser (I'm Feeling Ducky)

```ddgr -j [search terms]```

**Search a specific website**

```ddgr -w [amazon.com] [digital camera]```

**Limit search to recent results** (d=day, w=week, m=month, y=year)

```ddgr -t [w] [search terms]```

**Set number of results** per page

```ddgr -n [25] [search terms]```

**Use a DuckDuckGo bang** shortcut

```ddgr ![w] [wikipedia search]```

**Output results as JSON**

```ddgr --json [search terms]```

**Search through a proxy**

```ddgr --proxy [localhost:8118] [search terms]```

# SYNOPSIS

**ddgr** [_OPTIONS_] [_KEYWORD_ [_KEYWORD_...]]

# PARAMETERS

**-n**, **--num**=_N_
> Show N results per page (0-25, default: 10).

**-r**, **--reg**=_REG_
> Region-specific search (e.g., us-en, uk-en, in-en).

**-j**, **--ducky**
> Open first result in browser; implies --noprompt.

**-t**, **--time**=_SPAN_
> Limit search by time: d (day), w (week), m (month), y (year).

**-w**, **--site**=_SITE_
> Search a specific website.

**-x**, **--expand**
> Show complete URLs instead of just domains.

**-p**, **--proxy**=_URI_
> Route traffic through HTTP proxy.

**--unsafe**
> Disable safe search.

**--json**
> Output results as JSON; implies --noprompt.

**--np**, **--noprompt**
> Search and exit without interactive prompt.

**--colors**=_COLORS_
> Set custom output color scheme.

**-C**, **--nocolor**
> Disable colored output.

**-h**, **--help**
> Display help and exit.

# OMNIPROMPT

**n**, **p**, **f**
> Navigate to next, previous, or first page.

_index_
> Open result number in browser.

**o** [_index_|_range_|**a**]
> Open result(s) in browser.

**d** _keywords_
> Perform new search with same options.

**c** _index_
> Copy URL to clipboard.

**x**
> Toggle URL expansion.

**q**, **^D**, double Enter
> Exit ddgr.

# DESCRIPTION

**ddgr** is a command-line tool for searching DuckDuckGo from the terminal. It displays search results with title, URL, and text context. Results are paginated and indexed, allowing quick navigation and opening in a browser by number.

The tool supports DuckDuckGo bangs (shortcuts like !w for Wikipedia, !yt for YouTube) and keywords like filetype: and site:. Results can be limited by time period or region. DuckDuckGo's privacy-focused approach means no tracking, and ddgr works over the Tor network.

# ENVIRONMENT

**BROWSER**
> Override the default web browser.

**DDGR_COLORS**
> Custom color scheme (six-letter string like BSD LSCOLORS).

**HTTPS_PROXY**
> HTTP proxy configuration.

# CAVEATS

Requires Python 3.8 or later. Results depend on DuckDuckGo's HTML interface which may change. Some features like instant answers are not available in the HTML version used by ddgr.

# HISTORY

ddgr was created by Arun Prakash Jana as a privacy-focused alternative to googler (a similar tool for Google search). The project emphasizes user privacy by leveraging DuckDuckGo's no-tracking policy and support for the Tor network.

# SEE ALSO

[googler](/man/googler)(1), [surfraw](/man/surfraw)(1), [w3m](/man/w3m)(1), [lynx](/man/lynx)(1)
