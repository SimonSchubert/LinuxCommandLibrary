# TAGLINE

Build and query a geocoding pack from local OpenStreetMap extracts

# TLDR

**Build** a Pack from one extract

```open-geocode pack build --input [ontario.osm.pbf] --pack [ontario]```

**Check** a Pack after copying it

```open-geocode pack verify --pack [ontario]```

**Search** the text index

```open-geocode pack search --pack [ontario] --query "[10 Downing Street]"```

**Reverse** geocode one coordinate

```open-geocode pack reverse --pack [ontario] --lon [-0.1276] --lat [51.5072]```

**Serve** the HTTP API

```open-geocode serve --pack [ontario]```

**Probe** a running server

```open-geocode health```

# SYNOPSIS

**open-geocode** **pack** **build** | **inspect** | **verify** | **search** | **reverse** | **bench** ...

**open-geocode** **geocode** **batch** | **bench** | **calibrate** ...

**open-geocode** **parse** **query** | **bench** | **fixture** ...

**open-geocode** **serve** **--pack** _PATH_ [_options_]

**open-geocode** **health** [**--bind** _ADDR_]

# DESCRIPTION

**open-geocode** builds a Pack from one or more **.osm.pbf** extracts and serves forward, autocomplete, reverse, and batch geocoding from that Pack. The Pack is memory-mapped. There is no PostgreSQL or Elasticsearch process beside it.

This binary reads extracts you already have. The companion **og** binary, built with the crate's **tui** feature, downloads Geofabrik regions and opens an interactive UI. Docker images of this project serve a Pack mounted at **/packs/pack** and use **open-geocode health** as the container health check. **health** exits **0** when **GET /readyz** on the bind address returns 200, and **1** otherwise.

**pack build** publishes the new Pack atomically. Repeat **--input** to cover several extracts in one Pack. They should be from the same date, because an older copy of a shared boundary would otherwise win. Scratch files default to a directory inside the Pack. A stopped build is kept. The next build refuses to start beside it until **--resume** or **--fresh**.

**serve** binds **127.0.0.1:8080** by default, can serve a static demo directory and a PMTiles basemap, and stores job results under a per-port directory in the system temp dir unless **--job-dir** or the job-dir environment variable is set (the name is **OG** then **JOB** then **DIR**, joined with underscores). Ctrl-C or SIGTERM waits for open requests, then drops what is still open. **--shutdown-timeout 0** drops them at once.

**geocode batch** writes latitude and longitude columns for CSV rows. **geocode calibrate** fits an answer-confidence model from held-out points and stores it beside the Pack. **parse query** prints how the Pack's parser labels an address. **pack bench**, **geocode bench**, **parse bench**, and **fixture** are for measurements and fixture files.

Current releases are Apache 2.0. Versions up to and including 0.1.0 were MIT and stay under MIT. Generated Packs keep source metadata. The licence of the OpenStreetMap and OpenAddresses data you build from is yours to follow.

# COMMANDS

**pack build**
> Build from **.osm.pbf** input. **--input** and **--pack** are required.

**pack inspect**
> Print Pack records as JSON. **--row** reads one numeric row id. **--id** reads a stable id such as **osm:node:123**. **--layer** lists one layer. **--limit** defaults to **20** (0 means no limit). **--rejections** prints rejected evidence. **--context** adds boundary-derived context for **--row** or **--id**.

**pack verify**
> Check a Pack against its section checksums.

**pack search**
> Search the text index and print the matching records. **--query** is required. **--limit** defaults to **10**. **--layer** restricts the layer.

**pack reverse**
> One WGS84 coordinate. **--lon** and **--lat** are decimal degrees.

**pack bench**
> Pack size, open time, and query latency.

**geocode batch**
> Geocode CSV rows into latitude and longitude columns. Flags are listed by **open-geocode geocode batch --help**.

**geocode bench**
> Score forward geocoding against a JSON fixture of expected coordinates.

**geocode calibrate**
> Fit confidence from held-out address points. **--addresses** is required and repeatable. Those points must not be ones the Pack was built from. Default sample is **1000** rows, **3** messy queries each, seed **1**, and a hit inside **100** metres counts as right.

**parse query**
> Label the tokens of one address query.

**serve**
> Runtime HTTP API. **--pack** is the Pack directory or Pack file.

**health**
> Exit **0** if **/readyz** answers 200.

# PARAMETERS

**--input** _FILE_
> **.osm.pbf** extract, sorted by type and id. Repeatable. Required for **pack build**.

**--pack** _PATH_
> Output directory for **pack build**. For the other pack subcommands and for **serve**, the Pack directory or Pack file.

**--memory-budget-mb** _N_
> Buffer memory for a build, from **64** to **1048576** MiB. Larger inputs spill to scratch. Default: half of the memory this process can use, minus what the build holds outside its buffers.

**--scratch-dir** _DIR_
> Scratch files. Default: inside the Pack directory.

**--scratch-budget-mb** _N_
> Most scratch disk held at once, in MiB.

**--force**
> Build even when the pre-flight check says memory or disk is short.

**--resume**
> Continue a stopped build of the same inputs and options from its last checkpoint. Conflicts with **--fresh**.

**--fresh**
> Delete leftovers and start over.

**--openaddresses**
> Download OpenAddresses points for the countries this Pack covers. Needs an API token in **OA** **TOKEN** (joined with an underscore). Files are kept in **<pack>/openaddresses** for the next build. Conflicts with **--openaddresses-zip**.

**--openaddresses-zip** _ZIP_
> The same merge, read from a collection archive such as **collection-global.zip**, with no token and nothing unpacked.

**--openaddresses-non-commercial**
> Also take sets whose licence forbids commercial use, such as CC BY-NC. The Pack is then for non-commercial use only. Sets that forbid serving them at all stay out.

**--addresses** _[DATASET=]PATH_
> Extra address points: OpenAddresses GeoJSON (one feature per line) or CSV with LON, LAT, NUMBER, and STREET columns, gzipped or plain. Repeatable.

**--qrank** _PATH_
> A QRank file (**qrank.csv.gz**) used to rank places that share a name. Without it, tags alone tell them apart.

**--query** _TEXT_
> Search text for **pack search**, or the address for **parse query**.

**--lon** _DEGREES_, **--lat** _DEGREES_
> Coordinate for **pack reverse**.

**--bind** _ADDR_
> Listen address for **serve** and **health**. Default: **127.0.0.1:8080**.

**--demo** _DIR_
> Static demo directory **serve** also publishes. Default: **demo**.

**--basemap** _FILE_
> PMTiles archive served at **/basemap.pmtiles**. Default: **data/ontario.pmtiles**. A missing file is skipped.

**--job-dir** _DIR_
> Where **/jobs** results are written. Default: a per-port directory in the temp dir.

**--shutdown-timeout** _SECONDS_
> How long **serve** waits after Ctrl-C or SIGTERM before dropping what is still open. **0** drops it immediately.

# CAVEATS

**pack build** will not start beside an unfinished build of the same Pack unless you pass **--resume** or **--fresh**.

**--openaddresses** and **--openaddresses-zip** cannot be used together.

A Pack built with **--openaddresses-non-commercial** is not a general-purpose public service. The flag exists so a non-commercial build can include those sets on purpose.

**health** only checks **/readyz**. It does not build or load a Pack.

The default **serve** address is loopback. Reaching it from another machine means changing **--bind** and putting a proxy or firewall in front.

# SEE ALSO

[og](/man/og)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/open-geocode-rs/open-geocode)```

```[Homepage](https://opengeocode.com)```

```[Documentation](https://opengeocode.com/docs/)```

<!-- verified: 2026-11-18 -->
