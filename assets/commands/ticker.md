# TAGLINE

Terminal stock and crypto price tracker

# TLDR

**Watch stock prices** in real time

```ticker -w [AAPL,MSFT,GOOG]```

**Track stocks** with position tracking from a config file

```ticker```

**Show stock prices** in JSON format

```ticker -w [AAPL,MSFT] --format json```

**Show stock prices** in CSV format

```ticker -w [AAPL,MSFT] --format csv```

**Watch cryptocurrency prices**

```ticker -w [BTC-USD,ETH-USD]```

**Use a custom config file**

```ticker -c [path/to/config.yaml]```

# SYNOPSIS

**ticker** [**-c** _config_] [**-w** _symbols_] [**--format** _format_] [**--show-fundamentals**] [**--show-tags**] [**--show-separator**]

# PARAMETERS

**-w**, **--watchlist** _symbols_
> Comma-separated list of stock or crypto symbols to watch.

**-c**, **--config** _file_
> Path to the configuration file. Default is ~/.ticker.yaml.

**--format** _format_
> Output format: default, json, or csv.

**--show-fundamentals**
> Show fundamental data like P/E ratio and market cap.

**--show-tags**
> Display tags associated with symbols.

**--show-separator**
> Show a separator between symbols in output.

**--show-holdings**
> Display holdings and position values.

**--sort** _field_
> Sort output by field (e.g., change, changePercent).

**--proxy** _url_
> Proxy URL for API requests.

**-i**, **--interval** _seconds_
> Refresh interval in seconds.

# DESCRIPTION

**ticker** is a terminal-based stock and cryptocurrency tracker that displays live price updates and position tracking. Written in Go, it provides real-time quotes from Yahoo Finance and CoinMarketCap, supporting stocks, ETFs, mutual funds, and cryptocurrencies.

The tool can track both current prices and your portfolio positions with support for multiple cost basis lots. It displays pre-market and post-market prices when available, making it useful for monitoring investments outside regular trading hours.

Configuration is typically done through a YAML file (~/.ticker.yaml) where you can define watchlists, positions with cost basis, and display preferences. The config file supports grouping symbols with tags and setting up multiple portfolios.

# CAVEATS

Market data from Yahoo Finance may have a slight lag (up to 30 seconds) due to intermediary systems. Real-time data is available for NYSE and NASDAQ, but other exchanges may have additional delays. Cryptocurrency prices are sourced from CoinMarketCap via Yahoo Finance.

# HISTORY

**ticker** was created by **Ani Channarasappa** and first released in **2020**. It was developed to provide a lightweight, terminal-based alternative to web-based stock tracking tools, appealing to developers and terminal enthusiasts who prefer command-line workflows.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1)
