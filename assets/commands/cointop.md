# TAGLINE

Terminal-based cryptocurrency tracker

# TLDR

**Open** the interactive TUI

```cointop```

**Start in portfolio** view

```cointop --portfolio```

**Show only the top N** cryptocurrencies

```cointop --top [50]```

**Clear** the cache

```cointop clean```

**Display current holdings** in human-readable format

```cointop holdings --human```

**Check price** of specific coins

```cointop price --coins [bitcoin,ethereum]```

**Reset configuration** to defaults

```cointop reset --config```

# SYNOPSIS

**cointop** [_command_] [_options_]

# PARAMETERS

**clean**
> Clear the cache.

**holdings**
> Display portfolio holdings.

**price**
> Check price of specific coins.

**reset**
> Reset configuration or cache.

**version**
> Display version information.

**--portfolio**
> Start in portfolio view.

**--top** _N_
> Display only the top N cryptocurrencies.

**--no-color**
> Disable color output.

**--refresh-rate** _seconds_
> Data refresh rate in seconds.

**--human**
> Display values in human-readable format (with holdings).

**--coins** _coins_
> Comma-separated list of coin names (with price).

# DESCRIPTION

**cointop** is a fast, lightweight terminal-based cryptocurrency tracking and portfolio management tool. It displays real-time prices, market capitalizations, trading volumes, and price changes for thousands of cryptocurrencies in an interactive text user interface.

The interface provides keyboard-driven navigation with vim-style bindings (inspired by htop), allowing rapid browsing through coin lists, detailed charts, and portfolio views. Users can mark favorites, sort by various metrics, and track personal holdings with cost basis and profit/loss calculations.

Data is sourced from cryptocurrency APIs (CoinGecko by default) and cached locally for performance. The tool supports multiple currencies for price display and provides historical price charts rendered in ASCII. Configuration is stored in **~/.config/cointop/config.toml**.

# CAVEATS

Requires internet connection for price data. API rate limits may apply. Market data depends on the configured data source (CoinGecko or CoinMarketCap).

# SEE ALSO

[ticker](/man/ticker)(1)
