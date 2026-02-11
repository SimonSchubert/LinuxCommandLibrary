# TAGLINE

Console weather forecast service

# TLDR

**Get weather for current location** (based on IP)

```curl wttr.in```

**Get weather for a specific city**

```curl wttr.in/[Paris]```

**Get weather for a location** with spaces

```curl "wttr.in/~[Eiffel Tower]"```

**Get current weather only** (no forecast)

```curl wttr.in/[London]?0```

**Get one-line weather summary**

```curl "wttr.in/[Berlin]?format=3"```

**Get weather in metric units**

```curl wttr.in/[NewYork]?m```

**Get moon phase**

```curl wttr.in/moon```

**Get weather as PNG image**

```curl wttr.in/[Tokyo].png --output weather.png```

# SYNOPSIS

**curl** **wttr.in**/[_location_][?_options_]

# PARAMETERS

_location_
> City name, airport code (3 letters), GPS coordinates, area code, or domain name.

**?0**
> Show only current weather (no forecast).

**?1**
> Show current weather and today's forecast.

**?2**
> Show current weather, today's and tomorrow's forecast.

**?m**
> Use metric (SI) units.

**?u**
> Use USCS (US) units.

**?n**
> Narrow version showing only day and night.

**?q**
> Quiet version without "Weather report" header.

**?format=**_string_
> Custom format for one-line output. Example: format=3 for short summary.

**?T**
> Disable terminal sequences (for piping).

**?lang=**_code_
> Set language (e.g., lang=de for German).

**.png**
> Return weather as PNG image instead of text.

# DESCRIPTION

**wttr.in** is a console-oriented weather forecast service accessed via HTTP clients like curl, wget, or httpie. It provides weather information in ASCII art format directly in the terminal, requiring no installation.

The service supports various location types: city names, airport codes, GPS coordinates, area codes, and even domain names (to get weather for the server's location). Without a location, it uses your IP address to determine location.

Output can be customized for different use cases: full 3-day forecasts, current conditions only, one-line format for status bars (tmux, shell prompts), or PNG images. The v2 endpoint (v2.wttr.in) provides expanded data including historical information.

wttr.in supports multiple languages and both metric and imperial units. The service handles millions of queries daily and is free to use.

# CAVEATS

Requires internet connection and an HTTP client (curl, wget). Location detection via IP may be inaccurate for VPNs or proxies. Rate limiting may apply for excessive requests. ASCII art display requires a terminal with sufficient width and Unicode support for best results.

# HISTORY

**wttr.in** was created by **Igor Chubin** around **2016** as a wrapper for the wego weather client, demonstrating console-oriented web services. It gained popularity through Hacker News and social media, growing to handle tens of millions of daily queries. The service continues to be maintained and improved with new features.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [wego](/man/wego)(1)
