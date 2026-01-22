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

**cointop** is a terminal-based cryptocurrency tracker. It displays real-time prices, market data, and portfolio information in an interactive text user interface.

The TUI supports keyboard navigation, sorting, favorites, and portfolio tracking.

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
