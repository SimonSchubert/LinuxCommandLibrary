# TAGLINE

open-source cryptocurrency trading bot

# TLDR

**Start the bot**

```octobot```

**Start with a specific data directory**

```octobot -d [/path/to/data]```

**Start in no-GUI mode**

```octobot --no-web```

**Start with backtesting**

```octobot --backtesting```

# SYNOPSIS

**octobot** [_options_]

# PARAMETERS

**-d** _DIR_, **--data-dir** _DIR_
> Specify data directory.

**--no-web**
> Start without the web interface.

**--backtesting**
> Start in backtesting mode.

**--simulate**
> Start in simulated trading mode.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display version.

# DESCRIPTION

**octobot** is an open-source cryptocurrency trading bot that supports automated trading with AI-driven strategies, grid trading, DCA (dollar cost averaging), and custom strategies across 15+ exchanges.

The bot can run headless from the command line or with a web interface for configuration and monitoring. It supports backtesting for strategy evaluation and simulated trading for risk-free testing. Strategies and exchanges are configured through plugins called tentacles.

# CAVEATS

Requires Python 3.10+. Exchange API keys needed for live trading. Trading involves financial risk. Available via pip or Docker.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [hummingbot](/man/hummingbot)(1), [cointop](/man/cointop)(1)

