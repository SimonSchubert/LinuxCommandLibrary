# TAGLINE

terminal-based cryptocurrency tracker

# TLDR

Open the **TUI interface**

```cointop```

**Clear** the cache

```cointop clean```

Display current **holdings** in human-readable format

```cointop holdings --human```

Check **price** of specific coins

```cointop price --coins [coin1,coin2,...]```

Display **version**

```cointop version```

# SYNOPSIS

**cointop** [_command_] [_options_]

# DESCRIPTION

**cointop** is a fast, lightweight terminal-based cryptocurrency tracking and portfolio management tool. It displays real-time prices, market capitalizations, trading volumes, and price changes for thousands of cryptocurrencies in an interactive text user interface.

The interface provides keyboard-driven navigation with vim-style bindings, allowing rapid browsing through coin lists, detailed charts, and portfolio views. Users can mark favorites, sort by various metrics, and track personal holdings with cost basis and profit/loss calculations.

Data is sourced from cryptocurrency APIs and cached locally for performance. The tool supports multiple currencies for price display and provides historical price charts rendered in ASCII. Portfolio data is stored locally in a configuration file, making it suitable for privacy-conscious users who prefer local-first tools over web-based trackers.

# PARAMETERS

**clean**
> Clear the cache

**holdings**
> Display portfolio holdings

**price**
> Check price of specific coins

**version**
> Display version information

**--human**
> Display values in human-readable format

**--coins** _coins_
> Comma-separated list of coin names

# CAVEATS

Requires internet connection for price data. API rate limits may apply. Market data depends on the configured data source.

# SEE ALSO

[ticker](/man/ticker)(1)
