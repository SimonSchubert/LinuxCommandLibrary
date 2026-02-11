# TAGLINE

Web reconnaissance and OSINT framework

# TLDR

**Start recon-ng** interactive console

```recon-ng```

**Create or load a workspace**

```recon-ng -w [workspace_name]```

**List available modules**

```marketplace search```

**Install a module**

```marketplace install [module_name]```

**Load a module**

```modules load [module_name]```

**Show module options**

```options list```

**Run the loaded module**

```run```

# SYNOPSIS

**recon-ng** [**-w** _workspace_] [**-r** _resource_] [**--no-analytics**]

# PARAMETERS

**-w** _workspace_
> Create or load the specified workspace

**-r** _resource_
> Execute resource file (automation script)

**--no-analytics**
> Disable anonymous usage tracking

**--no-check**
> Disable version check at startup

**-h**, **--help**
> Display help message

# CONSOLE COMMANDS

**workspaces list**
> List available workspaces

**workspaces create** _name_
> Create a new workspace

**marketplace search** [_term_]
> Search available modules in marketplace

**marketplace install** _module_
> Install a module from marketplace

**modules load** _module_
> Load an installed module

**options set** _option_ _value_
> Set module option

**options list**
> Display current module options

**run**
> Execute the loaded module

**show** _table_
> Display data from database tables (hosts, contacts, domains, etc.)

**keys add** _name_ _value_
> Add API key for external services

**keys list**
> List configured API keys

# DESCRIPTION

**recon-ng** is a modular reconnaissance framework for gathering open-source intelligence (OSINT). Designed with a Metasploit-like interface, it provides a familiar workflow for security professionals conducting the information-gathering phase of assessments.

The framework uses workspaces to organize reconnaissance projects, with each workspace maintaining its own database of collected data (domains, hosts, contacts, credentials, etc.). Modules can query this data and add new findings, building comprehensive intelligence profiles.

Modules cover various reconnaissance categories: discovery (subdomain enumeration, port scanning), recon (WHOIS, DNS records, social media), import (data ingestion), and reporting (HTML, JSON, Excel exports). Many modules integrate with external APIs (Shodan, VirusTotal, HaveIBeenPwned) requiring API keys.

# CONFIGURATION

**~/.recon-ng/workspaces/**
> Workspace directories containing per-project SQLite databases with collected hosts, contacts, domains, and credentials.

**keys add** _name_ _value_
> API keys for external services (Shodan, VirusTotal, HaveIBeenPwned, etc.) stored in the workspace database and required by many modules.

# CAVEATS

**Authorization required**: Only perform reconnaissance against targets you have permission to assess. Unauthorized reconnaissance may violate laws and terms of service.

Many powerful modules require API keys from external services. Configure keys with **keys add** before using those modules. Some services have rate limits or require paid subscriptions.

The marketplace must be accessed to install modules beyond the base set. Ensure network connectivity for marketplace operations.

Module results vary in accuracy. Cross-reference findings from multiple sources and validate critical information manually.

# HISTORY

Recon-ng was developed by **Tim Tomes** while working at Black Hills Information Security. First released around **2012**, it was designed to bring the modular, database-driven approach of Metasploit to the reconnaissance phase. The framework is written in Python and continues active development with community-contributed modules.

# SEE ALSO

[maltego](/man/maltego)(1), [theharvester](/man/theharvester)(1), [amass](/man/amass)(1), [nmap](/man/nmap)(1)
