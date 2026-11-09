# TAGLINE

Console weather forecast service

# TLDR

**Get weather for current location** (based on IP)

```curl wttr.in```

**Get weather for a specific city**

```curl wttr.in/[Paris]```

**Get weather for a landmark** or named location

```curl "wttr.in/~[Eiffel+Tower]"```

**Get current weather only** (no forecast)

```curl "wttr.in/[London]?0"```

**Get one-line weather summary**

```curl "wttr.in/[Berlin]?format=3"```

Get a **custom one-line** format

```curl "wttr.in/[Berlin]?format=%l:+%c+%t+%w"```

Get weather as **JSON**

```curl "wttr.in/[Berlin]?format=j1"```

Get the **data-rich** view

```curl v2.wttr.in/[Berlin]```

Show **help** for all options

```curl wttr.in/:help```

**Get weather in metric units**

```curl "wttr.in/[NewYork]?m"```

**Get moon phase**

```curl wttr.in/moon```

**Get weather as PNG image**

```curl wttr.in/[Tokyo].png --output weather.png```

# SYNOPSIS

**curl** **wttr.in**/[_location_][?_options_]

# PARAMETERS

_location_
> City name, landmark (use + for spaces), airport code (3 letters), GPS coordinates, area code, or domain name (prefixed with @).

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

**?Q**
> Superquiet version (no "Weather report" text, no city name).

**?format=**_string_
> One-line output presets 1-4, **j1**/**j2** for JSON, **v2** for the data-rich view, or a custom string: %c (condition), %C (condition name), %t (temperature), %f (feels like), %w (wind), %h (humidity), %p (precipitation), %P (pressure), %l (location), %m (moon phase), %S (sunrise), %s (sunset).

**?T**
> Disable terminal sequences (for piping).

**?F**
> Do not show the "Follow" line.

**?d**
> Restrict output to standard console font glyphs.

**?A**
> Ignore the User-Agent and force ANSI output.

**?M**
> Show wind speed in m/s.

**?lang=**_code_
> Set language (e.g., lang=de for German). Also available as subdomain: fr.wttr.in.

**.png**
> Return weather as PNG image instead of text. PNG options follow an underscore, such as `Paris_0pq.png`.

**moon**[@_YYYY-MM-DD_]
> Show the moon phase, optionally for a date.

# DESCRIPTION

**wttr.in** is a console-oriented weather forecast service accessed via HTTP clients like curl, wget, or httpie. It provides weather information in ASCII art format directly in the terminal, requiring no installation.

The service supports various location types: city names, 3-letter airport codes, GPS coordinates, area codes, domain names (prefixed with @), and landmarks (prefixed with ~). Without a location, it uses your IP address to determine location.

Output can be customized for different use cases: full 3-day forecasts, current conditions only, one-line format for status bars (tmux, shell prompts), JSON for scripts, or PNG images. Multiple locations can be requested at once, separated by colons. The v2 endpoint (v2.wttr.in) provides a data-rich view, and **wttr.is** is a fully equivalent fallback domain.

wttr.in supports multiple languages and both metric and imperial units. The service handles millions of queries daily and is free to use.

# CAVEATS

Requires internet connection and an HTTP client (curl, wget). Location detection via IP may be inaccurate for VPNs or proxies. Rate limiting may apply for excessive requests. Quote URLs containing **?** or **&** so the shell does not treat them as special characters. ASCII art display requires a terminal with sufficient width and Unicode support for best results.

# HISTORY

**wttr.in** was created by **Igor Chubin** in late **2015** as a wrapper for the wego weather client, demonstrating console-oriented web services. It gained popularity through Hacker News and social media, growing to handle tens of millions of daily queries. The service continues to be maintained and improved with new features.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [wego](/man/wego)(1)

# RESOURCES

```[Source code](https://github.com/chubin/wttr.in)```

```[Homepage](https://wttr.in/)```

```[Documentation](https://wttr.in/:help)```

<!-- verified: 2026-11-09 -->
