# TAGLINE

Currencies, prices, and rates as an MCP server

# TLDR

**Serve** open price data over stdio

```janas-prices```

Point at a file with an **Alpha Vantage** key

```janas-prices --config [~/.config/janas/prices.conf]```

Register with **Claude Code**

```claude mcp add prices -- /path/to/janas-prices```

# SYNOPSIS

**janas-prices** [**--config** _FILE_]

# DESCRIPTION

**janas-prices** is a Janas service: an MCP server over standard input and output for prices and finance, for information only. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory. Only share quotes need a key.

Tools:

- **prices_currency** — convert an `amount` (default 1) `from` a currency (default EUR) `to` others (default USD, GBP, CHF, JPY), at the ECB reference rates of the latest working day or of `date`
- **prices_crypto** — a coin by name or symbol, in `currency` (default EUR), with the 24-hour change and market value
- **prices_stock** — last price of a symbol (`AAPL`, `TSCO.LON`) or a company name, plus change, open, high, low, and previous close. Needs an Alpha Vantage key. Quotes may be delayed
- **prices_inflation** — a country (`country` is an ISO code, `EA` for the euro area; otherwise the user's country). Thirteen months from Eurostat for the EU, Iceland, Norway, and the euro area; yearly World Bank figures elsewhere
- **prices_rates** — `ecb`, `fed`, `boe`, or `snb` (the user's country unless asked): ECB deposit, main refinancing, marginal lending, and €STR; the Fed's effective funds rate and target range; the Bank of England Bank Rate; the SNB policy rate
- **prices_electricity** — next-day wholesale price, hour by hour, for a place's bidding zone (`day` is today or tomorrow). The exchange price, before taxes and charges
- **prices_fuel** — cheapest stations within `radius` (5 km unless asked, 20 km at most) for petrol, diesel, lpg, or cng, with price, distance, direction, and when the price was reported

Every answer names its source and date, and says the figures are not advice to buy or sell. **janas-chat** shows the full layout and gives the model a short brief. Logs go to standard error.

Sources, all without a key except shares: ECB reference rates through Frankfurter (the ECB file if Frankfurter is down); CoinGecko, then Coinbase; Eurostat HICP and the World Bank; the ECB, the New York Fed, the Bank of England, and the Swiss National Bank; energy-charts.info (Fraunhofer ISE) for zones it publishes under CC BY 4.0; fuel from Italy (MIMIT), France (prix-carburants), Spain (Ministry for the Ecological Transition), and Austria (E-Control). Places come from Nominatim, then the built-in tables. Requests carry a User-Agent naming the program, pause between calls (three seconds for energy-charts), and cache answers. CoinGecko answers are credited "Data provided by CoinGecko".

# PARAMETERS

**--config** _FILE_
> File that holds `alphavantage_key = KEY`. Default: `$XDG_CONFIG_HOME/janas/prices.conf`, or `~/.config/janas/prices.conf`. **JANAS_ALPHAVANTAGE_KEY** supplies the same key from the environment.

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**~/.config/janas/prices.conf**
> `alphavantage_key = KEY`. A line that names no known setting is reported at startup. A free key is issued at alphavantage.co. The free tier is 25 requests a day; one question costs one or two. Without a key, **prices_stock** explains how to get one.

**JANAS_LOCATION**
> Used when a tool is asked with no place. Otherwise GeoJS, then ipwho.is, then the time zone's city.

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `prices` in `~/.config/janas/mcp.json` replaces the automatic start.

Electricity is returned only for bidding zones whose licence on energy-charts is CC BY 4.0. Other zones are reported as not open data. An Italian place uses its region's zone. Fuel exists only for Italy, France, Spain, and Austria, and only the fuels those files publish. Italy's file is the morning snapshot; France can include prices weeks old (the date says so); Austria returns some of the stations near a point. Prices older than eight days are left out. The service does not call sources run from Russia or China.

# HISTORY

**janas-prices** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-maps](/man/janas-maps)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/prices/README.md)```

<!-- verified: 2026-10-23 -->
