# TAGLINE

Recent earthquakes as an MCP server

# TLDR

**Serve** earthquake queries over stdio

```janas-quakes```

Register with **Claude Code**

```claude mcp add quakes -- /path/to/janas-quakes```

# SYNOPSIS

**janas-quakes**

# DESCRIPTION

**janas-quakes** is a Janas service: a read-only MCP server over standard input and output for recent earthquakes. No key. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory.

Tools:

- **quakes_near** — events around a town, region, or sea (`place`; where the user is unless asked), within `radius` (300 km unless asked, 1,000 at most), over `days` (7 unless asked, 30 at most), of magnitude at least `min_mag` (2.5 unless asked). Latest first, with time, magnitude, depth, distance, direction, and the source's place name. A sea means events inside it
- **quakes_strong** — strongest events worldwide over `days` (7) of magnitude at least `min_mag` (5). Includes the USGS PAGER alert (green, yellow, orange, red) and whether the event was at sea and large enough that the USGS set its tsunami flag
- **quakes_event** — one event by the id earlier answers give the model, or the latest near a place, or with neither the latest near the user. Magnitude and type, time, place (sea or region, nearest town), depth, distance; from the USGS, felt reports, estimated Mercalli shaking, and impact. Includes the source page

Italy and the seas around it (about 35–48° N, 6–19° E, plus seas that reach into that box) come from INGV's FDSN service (CC BY 4.0). Everywhere else, and the worldwide strongest list, come from the USGS (public domain). If the source for a place does not answer, the other is asked, and the answer says which one replied. Place names in the tables are also filled from Nominatim and the built-in city and sea lists. Requests carry a User-Agent, wait a second between calls to one server, and keep answers for a minute.

**janas-chat** shows the list from a layout and gives the model a short brief, including each event's id. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**JANAS_LOCATION**
> City, `lat,lon`, or `off`, when no place is named. Otherwise GeoJS, then ipwho.is, then the time zone's city.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `quakes` in `~/.config/janas/mcp.json` replaces the automatic start.

Magnitude, time, point, and depth are the source's figures at the moment of the query. The first hours' estimates change, and every answer says so. In an emergency the civil-protection bulletin is the authority, not this service. The USGS tsunami flag means the earthquake was at sea and large enough for one; it is not itself a tsunami warning. INGV names places in Italian and the USGS in English. The built-in sea names stay English. The USGS catalog does not list every small event outside the United States. The service does not call sources run from Russia or China.

# HISTORY

**janas-quakes** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-weather](/man/janas-weather)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/quakes/README.md)```

<!-- verified: 2026-10-23 -->
