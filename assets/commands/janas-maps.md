# TAGLINE

Routes, transit, and places as an MCP server

# TLDR

**Serve** OpenStreetMap routing over stdio

```janas-maps```

Register with **Claude Code**

```claude mcp add maps -- /path/to/janas-maps```

# SYNOPSIS

**janas-maps**

# DESCRIPTION

**janas-maps** is a Janas service: an MCP server over standard input and output for roads and places. No key. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory.

Tools:

- **maps_route** — route between two places, or through a third (`via`), by car (default), bike, or on foot (`mode`). `avoid` can drop tolls, motorways, or ferries. Length, time without traffic, the main roads, whether it has tolls or a ferry, up to two other ways, the steps, and an openstreetmap.org link. Steps follow `LANG` (English if the router does not know the language). If Valhalla does not answer, OSRM gives the route without steps
- **maps_transit** — up to five public-transport journeys. `when` is `HH:MM` or `YYYY-MM-DD HH:MM` in the start's local time (a clock time already past is tomorrow). `arrive_by` asks to arrive by that time. Each journey has times, length, changes, and legs (line, operator, stops, walks)
- **maps_nearby** — places of one kind within a radius (2 km unless asked, 10 km at most), nearest first, at most ten, with distance, direction, address, and opening hours or phone when mapped. Kinds are a fixed list: fuel, charging, parking, pharmacy, hospital, doctor, atm, bank, post_office, police, supermarket, restaurant, cafe, bar, hotel, toilets, train_station, bus_stop, museum, attraction
- **maps_find** — full address, coordinates, what the map says a place is, and a link. A point returns what is there

A place is a name or address, best with its town, or `lat,lon`. The second place of a route is searched near the first. With no start, the start is where the user is, and the answer says so.

Data is OpenStreetMap, © OpenStreetMap contributors, ODbL, and every answer says so. Places: Nominatim, then Photon. Routes: Valhalla and OSRM on FOSSGIS servers. Transit: Transitous, from operators' open timetables. Nearby: the Overpass API, then Private.coffee's instance. The User-Agent is `janas-maps/<version> (+https://github.com/prabanta-dev/janas)`, and the program waits so each server sees at most one request a second. Answers are cached (places a week, routes ten minutes, journeys two minutes, nearby about an hour).

**janas-chat** shows the full layout and gives the model a short brief. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**JANAS_NOMINATIM_URL**, **JANAS_PHOTON_URL**, **JANAS_VALHALLA_URL**, **JANAS_OSRM_URL**, **JANAS_TRANSITOUS_URL**, **JANAS_OVERPASS_URL**, **JANAS_OVERPASS_URL2**
> Replace a public instance with another, including one you run.

**JANAS_LOCATION**
> City, `lat,lon`, or `off`, when no start is named. Otherwise GeoJS, then ipwho.is, then the time zone's city.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `maps` in `~/.config/janas/mcp.json` replaces the automatic start.

Road times have no traffic. FOSSGIS Valhalla routes up to 1,500 km, and its OSRM map is Europe only; longer routes, or routes off Europe when Valhalla is down, are reported unavailable. Transitous has the timetables operators publish, not every bus company; live times are marked when present. Nearby places are whatever is mapped, distances are straight-line, and opening hours can be stale. If both Overpass instances are busy, the answer says to try again in a minute. The public servers are run by volunteers for moderate use. Transitous asks to be used by open-source, non-commercial projects.

# HISTORY

**janas-maps** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-weather](/man/janas-weather)(1), [janas-prices](/man/janas-prices)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/maps/README.md)```

<!-- verified: 2026-10-23 -->
