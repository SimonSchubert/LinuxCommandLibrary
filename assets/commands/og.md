# TAGLINE

Build an open-data geocoding pack and search it from the terminal

# TLDR

**Open** the interactive builder and search screen

```og```

**Build** one region's pack from OpenStreetMap

```og build --region [canada/ontario]```

Build **several regions** into one pack

```og build --region [canada/ontario] --region [canada/quebec] --name [canada-east]```

**Serve** that pack's HTTP API

```og serve [canada-ontario]```

Serve it on **another address**

```og serve [canada-ontario] --bind [127.0.0.1:9090]```

**Resume** a build that stopped

```og build --region [canada/ontario] --resume```

# SYNOPSIS

**og**

**og** **build** **--region** _ID_ [**--region** _ID_]... [_options_]

**og** **serve** _PACK_ [**--bind** _ADDR_]

# DESCRIPTION

**og** is the interactive binary of open-geocode. With no subcommand it opens a terminal UI: pick a region, build a Pack, search it, and geocode CSV files. **build** and **serve** do the same two jobs from the shell.

A Pack is one file set of addresses, places, and boundaries built from OpenStreetMap extracts, optionally merged with OpenAddresses. **build** downloads the region's Geofabrik extract, builds the Pack, and keeps both under the og home. **serve** listens on **127.0.0.1:8080** unless **--bind** is set. The Pack argument is a name under the home's **packs/** directory, such as **canada-ontario**, or a filesystem path when that directory does not exist.

The home is the **OG** **HOME** environment variable when it is set (those two words joined with an underscore). Otherwise it is the platform local data directory plus **open-geocode**. On Linux that is usually **~/.local/share/open-geocode**. Extracts are **pbf/** under that home, finished Packs are **packs/**, and **builds.jsonl** lists each build.

The binary is crate feature **tui** of the **open-geocode** package. From a clone: **cargo install --path . --features tui --bin og**. The lower-level **open-geocode** binary builds Packs from local **.osm.pbf** files and does not download Geofabrik regions. The container image serves a Pack with that binary. The license of current releases is Apache 2.0.

# COMMANDS

**build**
> Download one or more catalog regions and build one Pack. **--region** is required and repeatable. A single region is named from its id (**canada/ontario** becomes **canada-ontario**). Several regions need **--name**, or their ids are joined. A build that stopped leaves a checkpoint. The next **build** of that Pack refuses to start until **--resume** or **--fresh**.

**serve** _PACK_
> HTTP API for a finished Pack. **GET /version** reports the server version and which Pack is loaded.

# PARAMETERS

**--region** _ID_
> Catalog id, for example **canada/ontario**. Repeat for one Pack that covers several regions.

**--name** _NAME_
> Pack name when several regions are built together. Ignored for a single region.

**--memory-budget-mb** _N_
> Memory for the build's buffers, in MiB. Default: what this machine can give.

**--scratch-budget-mb** _N_
> Most scratch disk the build may hold at once, in MiB. Near the cap it compresses spill harder. Past it, or when the volume is full, the build stops early. The volume's free space caps it either way.

**--force**
> Build even when the pre-flight check finds too little memory or disk.

**--resume**
> Continue a stopped build of this Pack from its last checkpoint. If there is none, start over. Conflicts with **--fresh**.

**--fresh**
> Delete leftovers of a stopped build and start over.

**--download**
> Download the extract again even when one is already on disk.

**--openaddresses**
> Merge OpenAddresses points for the countries the Pack covers, skipping points OpenStreetMap already has. Needs an OpenAddresses API token in the environment variable **OA** **TOKEN** (those two words joined with an underscore). Data sets whose licence forbids commercial use, or forbids serving them at all, are left out.

**--bind** _ADDR_
> Listen address for **serve**. Default: **127.0.0.1:8080**.

# CONFIGURATION

**OG HOME**
> Root of extracts, Packs, and **builds.jsonl**. Unset, the platform local data directory is used. Set it when that directory cannot be discovered.

# CAVEATS

Ctrl-C during **build** keeps the last checkpoint so **--resume** can continue. A second interrupt quits at once.

Without **--resume** or **--fresh**, a new build refuses to start beside an unfinished one and says what it left.

**--openaddresses** does not take non-commercial OpenAddresses sets. The **open-geocode** binary's pack builder has a separate flag for those, and the resulting Pack is then limited to non-commercial use.

**og serve** is a long-running process. The interactive UI searches and geocodes CSV files on this machine. For scripted search of a Pack file, use **open-geocode**.

# SEE ALSO

[open-geocode](/man/open-geocode)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/open-geocode-rs/open-geocode)```

```[Homepage](https://opengeocode.com)```

```[Documentation](https://opengeocode.com/docs/quickstart/)```

<!-- verified: 2026-11-18 -->
