# TAGLINE

Forecasts, sea state, and warnings as an MCP server

# TLDR

**Serve** weather over stdio

```janas-weather```

Pin **where the user is**

```claude mcp add weather -e JANAS_LOCATION=[Trapani] -- /path/to/janas-weather```

Register with no location override

```claude mcp add weather -- /path/to/janas-weather```

# SYNOPSIS

**janas-weather**

# DESCRIPTION

**janas-weather** is a Janas service: an MCP server over standard input and output for the weather, the sea, and warnings. No key. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory.

Tools:

- **weather_now** — sky, temperature and feels-like, humidity, wind and gusts on the Beaufort scale, rain, pressure, today's low and high, sunrise and sunset, from a forecast model. Beside that, the nearest airport METAR within 40 km, with when and how far. A gap of 3 °C or more, or a disagreement about rain, is called out, and the answer says which figure is the measurement
- **weather_forecast** — up to 16 days (sky, low, high, rain and its chance, wind, gusts, UV, sunrise, sunset), plus the next 24 hours every three hours or the next 48 every hour
- **weather_sea** — sea state now and up to 8 days: Douglas-scale wave names, wind waves, swell, water temperature, and wind. A whole sea (English or Italian name) is up to nine points plus a summary; a coastal place is the sea off that place
- **weather_alerts** — MeteoAlarm warnings in force (wind, thunderstorms, heat, snow; yellow, orange, red), the place's region first. In Italy, also the Civil Protection levels for floods, landslides, and thunderstorms, today and tomorrow

A place is an Italian or English name, with region or country when needed, an Italian region (or another region's English name, standing for its largest city while warnings keep the region), an airport code, or coordinates. Times are in the place's local time.

With no place, the service takes where the user is and says how it knows: **JANAS_LOCATION** (a built-in English city name, `lat,lon`, or `off` to force a question), else GeoJS or ipwho.is (at most once an hour; the town can be the provider's), else the time zone's city (`Europe/Rome` is Rome). **janas-chat** passes its environment to the services it starts. The same lookup is what **janas-flights** uses for **flights_nearby**.

Forecasts and places by name come from Open-Meteo (CC BY 4.0, free for non-commercial use), and from MET Norway (CC BY 4.0) when Open-Meteo does not answer. The sea is Open-Meteo's marine models. Stations are airport METAR from aviationweather.gov. Warnings are MeteoAlarm. Italy's alert levels are the Civil Protection bulletin (CC BY 4.0). Airport, city, and sea tables are the ones **janas-flights** builds in. Forecasts and warnings are kept 15 minutes, a station report 10, the Civil Protection bulletin an hour. MET Norway requests use `janas-weather/<version> https://github.com/prabanta-dev/janas`.

The server speaks both eras of the protocol, as **janas-mcp** does. **janas-chat** shows the layout and gives the model a short brief. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**JANAS_LOCATION**
> City, `lat,lon`, or `off`. See the description for the fallback order.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `weather` in `~/.config/janas/mcp.json` replaces the automatic start.

A forecast is a model value; a METAR is a measurement. The IP geolocation can be a nearby town, not the machine's. MeteoAlarm's Italian warnings are the Air Force weather service's; the official alerts are the Civil Protection's, and the answer gives both. That bulletin appears around 16:00 for today and tomorrow; until then, yesterday's "tomorrow" is today. Open-Meteo is free for non-commercial use.

# HISTORY

**janas-weather** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-flights](/man/janas-flights)(1), [janas-maps](/man/janas-maps)(1), [weather](/man/weather)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/weather/README.md)```

<!-- verified: 2026-10-23 -->
