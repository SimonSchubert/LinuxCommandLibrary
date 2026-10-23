# TAGLINE

Live flights and schedules as an MCP server

# TLDR

**Serve** live aircraft positions over stdio

```janas-flights```

Use a **schedules** key from another file

```janas-flights --config [~/.config/janas/flights.conf]```

Register with **Claude Code**

```claude mcp add flights -- /path/to/janas-flights```

Pass the AviationStack key in the **environment**

```claude mcp add flights -e JANAS_AVIATIONSTACK_KEY=[KEY] -- /path/to/janas-flights```

# SYNOPSIS

**janas-flights** [**--config** _FILE_]

# DESCRIPTION

**janas-flights** is a Janas service: an MCP server over standard input and output that answers questions about flights. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory. Any other MCP client can start it the same way.

Tools:

- **flight_status** — one flight by number (`VY1595`) or callsign. With a key: scheduled, estimated, and actual times (each airport's local time and UTC), delay, terminal, gate, and baggage belt. In the air: altitude, speed, climb or descent, a place in words, the route, and an arrival estimated from speed
- **flights_between** — today's flights from one airport to another, with times and, if airborne, where each is now. Needs the key
- **flights_over** — aircraft over a sea now, by its English or Italian name. Open data only
- **flights_nearby** — aircraft near an airport (IATA, ICAO, or a name people use), a city, or a point. With no place, near where the user is

Airports match IATA or ICAO codes, a city, or everyday names. Lists use open data only. AviationStack is asked only for one flight or one route.

Positions come from adsb.lol (Open Database License), with adsb.fi if that does not answer. Routes without a key come from adsbdb.com. Airport, city, and sea names are built in from OurAirports, GeoNames, and Natural Earth. Routes on record are often wrong for airlines that reuse callsigns (Ryanair, Wizz Air): a route that does not fit the position is marked probably wrong, or left out of a list.

**janas-chat** shows the long lists from a layout and gives the model a short brief. The server speaks both eras of the protocol, as **janas-mcp** does. Logs go to standard error.

# PARAMETERS

**--config** _FILE_
> File that holds `aviationstack_key = KEY`. Default: `$XDG_CONFIG_HOME/janas/flights.conf`, or `~/.config/janas/flights.conf`. **JANAS_FLIGHTS_CONFIG** names another file. **JANAS_AVIATIONSTACK_KEY** wins over the file.

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**~/.config/janas/flights.conf**
> One setting, `aviationstack_key`. A misspelled name is reported at startup.

**JANAS_AVIATIONSTACK_KEY**
> The same key. Overrides the file.

**JANAS_LOCATION**
> City name, `lat,lon`, or `off`. Used when **flights_nearby** is asked with no place. Otherwise the connection's position (GeoJS, then ipwho.is), then the time zone's city. **janas-chat** passes its environment through.

# CAVEATS

This is an MCP **server**, not a prompt. A client must spawn it. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `flights` in `~/.config/janas/mcp.json` replaces the automatic start.

The free AviationStack plan is 100 calls a month and today's flights only. Each question about a number or a route is one call; answers are kept for ten minutes. Without a key, **flight_status** says where a flight is, not its times. AviationStack marks times as `+00:00` while they are local, and its status string lags the actual times: the reported state comes from the actual times. A live position is attached to a flight only when the aircraft is on that route or on the ground at the right airport. Codeshares are folded into the number that was asked.

# HISTORY

**janas-flights** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-weather](/man/janas-weather)(1), [janas-maps](/man/janas-maps)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/flights/README.md)```

<!-- verified: 2026-10-23 -->
