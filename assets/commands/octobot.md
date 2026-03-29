# TAGLINE

open-source cryptocurrency trading bot

# TLDR

**Start the bot**

```octobot```

**Start in simulated trading mode**

```octobot --simulate```

**Start without the web interface**

```octobot --no_web```

**Start in backtesting mode**

```octobot --backtesting```

**Run strategy optimizer with a specific strategy**

```octobot --strategy_optimizer [StrategyClass]```

**Manage tentacles (plugins)**

```octobot tentacles --install --all```

# SYNOPSIS

**octobot** [_options_]

**octobot** **tentacles** [_options_]

**octobot** **node** [_options_]

# PARAMETERS

**-s**, **--simulate**
> Start with trader simulator mode only (no live trading).

**-nw**, **--no_web**
> Start without the web interface.

**-nt**, **--no-telegram**
> Start without the Telegram interface.

**-nl**, **--no_logs**
> Disable backtesting logs.

**-b**, **--backtesting**
> Start in backtesting mode using settings from config.json.

**-bf**, **--backtesting-files** _FILES_
> Specify backtesting data files (requires `-b`).

**-wdr**, **--whole-data-range**
> Use the entire dataset instead of the common overlap when backtesting.

**-ebt**, **--enable-backtesting-timeout**
> Limit backtesting run to 30 minutes.

**-r**, **--risk** _VALUE_
> Set the risk configuration between 0 and 1.

**-rts**, **--reset-trading-history**
> Reset trader history and start with a fresh portfolio.

**-o**, **--strategy_optimizer** _STRATEGY_
> Run the strategy optimizer with the specified strategy class.

**-u**, **--update**
> Update OctoBot to the latest available version.

**--encrypter**
> Start the exchange API key encryption tool.

**--identifier** _ID_
> Set the OctoBot community identifier.

**-v**, **--version**
> Display version.

# DESCRIPTION

**octobot** is an open-source cryptocurrency trading bot that supports automated trading with AI-driven strategies, grid trading, DCA (dollar cost averaging), and custom strategies across 15+ exchanges.

The bot can run headless from the command line or with a web interface for configuration and monitoring. It supports backtesting for strategy evaluation and simulated trading for risk-free testing. Strategies and exchanges are configured through plugins called tentacles, managed via the `tentacles` subcommand.

The `node` subcommand starts OctoBot in network node mode, supporting `--host`, `--port`, `--master`, and `--consumer_only` options for distributed deployments.

# CAVEATS

Requires Python 3.10+. Exchange API keys needed for live trading. Trading involves financial risk. Available via pip or Docker.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [hummingbot](/man/hummingbot)(1), [cointop](/man/cointop)(1)
