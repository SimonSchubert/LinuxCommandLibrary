# TAGLINE

Terminal weather app with ASCII animations

# TLDR

**Display current weather** for your location (auto-detected via IP)

```weathr```

**Use imperial units** (Fahrenheit, mph, inches)

```weathr --imperial```

**Simulate a specific weather condition**

```weathr --simulate [rain|snow|thunderstorm|fog|clear|...]```

**Simulate nighttime** weather

```weathr --simulate [condition] --night```

**Hide the status HUD** and show only the animation

```weathr --hide-hud```

**Add falling leaves** effect

```weathr --leaves```

# SYNOPSIS

**weathr** [**--imperial** | **--metric**] [**--simulate** _condition_] [**--night**] [**--leaves**] [**--auto-location**] [**--hide-location**] [**--hide-hud**] [**--silent**]

# PARAMETERS

**--simulate** _condition_
> Simulate a weather condition instead of using real data. Conditions: **clear**, **partly-cloudy**, **cloudy**, **overcast**, **fog**, **drizzle**, **rain**, **freezing-rain**, **rain-showers**, **snow**, **snow-grains**, **snow-showers**, **thunderstorm**, **thunderstorm-hail**

**--night**
> Simulate nighttime visuals (moon, stars, fireflies)

**--leaves**
> Add falling leaves animation (autumn effect)

**--imperial**
> Use imperial units: Fahrenheit, mph, inches

**--metric**
> Use metric units: Celsius, km/h, mm (default)

**--auto-location**
> Auto-detect location via IP geolocation (ipinfo.io)

**--hide-location**
> Hide location coordinates from the display

**--hide-hud**
> Hide the status HUD and show only the ASCII animation

**--silent**
> Suppress non-error messages

**-h**, **--help**
> Print help information

**-V**, **--version**
> Print version information

# DESCRIPTION

**weathr** is a terminal weather application that displays real-time weather data with animated ASCII art. It fetches current conditions from the **Open-Meteo** API and renders them as colorful terminal animations including rain, snow, thunderstorms, flying airplanes, drifting clouds, and birds.

The display adapts to time of day: daytime shows the sun, gliding clouds, V-shaped birds, and bright colors, while nighttime features the moon, twinkling stars, gliding clouds, fireflies, and shooting stars. A status HUD shows the weather category, temperature, wind speed, and precipitation.

**weathr** supports cross-platform use on Linux, macOS, Windows, and NixOS. It respects the **NO_COLOR** environment variable for accessibility.

# CONFIGURATION

Configuration is stored in a TOML file:
> **Linux**: ```~/.config/weathr/config.toml```
> **macOS**: ```~/Library/Application Support/weathr/config.toml```
> **Windows**: ```~/AppData/Roaming/weathr/config.toml```

Example configuration:

```
hide_hud = false
silent = false

[location]
latitude = 40.7128
longitude = -74.0060
auto = false
hide = false

[units]
temperature = "celsius"
wind_speed = "kmh"
precipitation = "mm"
```

**temperature**: ```celsius``` or ```fahrenheit```
**wind_speed**: ```kmh```, ```ms```, ```mph```, or ```kn``` (knots)
**precipitation**: ```mm``` or ```inch```

Setting **auto = true** under **[location]** uses IP-based geolocation. Providing explicit **latitude** and **longitude** avoids external API calls for privacy.

# CAVEATS

Location auto-detection relies on **ipinfo.io** for IP geolocation, which may be inaccurate behind VPNs or proxies. Weather data comes from **Open-Meteo**, which is free but may have reduced accuracy in remote regions. The application requires a terminal with truecolor support for the best visual experience; it falls back to basic colors when **COLORTERM** is not set to "truecolor" or "24bit".

# HISTORY

**weathr** was created by **Veirt** and written in **Rust**. The project is hosted on GitHub and licensed under **GPL-3.0-or-later**. Weather data is sourced from **Open-Meteo.com** (CC BY 4.0 licensed). The latest release is **v1.3.0** from February 2026.

# SEE ALSO

[wttr](/man/wttr)(1), [curl](/man/curl)(1)
