# TLDR

**Start trading** with a configuration and strategy

```freqtrade trade --config [config.json] --strategy [StrategyName]```

**Run backtesting** on historical data

```freqtrade backtesting --config [config.json] --strategy [StrategyName]```

**Download historical data** for backtesting

```freqtrade download-data --config [config.json] --pairs [BTC/USDT] --timeframes [1h]```

**Create a new configuration file** interactively

```freqtrade new-config```

**Optimize strategy parameters** with hyperopt

```freqtrade hyperopt --config [config.json] --strategy [StrategyName] --hyperopt-loss [SharpeHyperOptLoss]```

**List available exchanges**

```freqtrade list-exchanges```

**List trading pairs** on an exchange

```freqtrade list-pairs --config [config.json] --exchange [binance]```

**Start the web UI**

```freqtrade webserver --config [config.json]```

# SYNOPSIS

**freqtrade** _command_ [_options_]

**freqtrade** trade [_-c config_] [_-s strategy_]

**freqtrade** backtesting [_-c config_] [_-s strategy_]

# PARAMETERS

**-c**, **--config** _PATH_
> Specify configuration file (default: config.json)

**-s**, **--strategy** _NAME_
> Specify strategy class name

**--strategy-path** _PATH_
> Additional strategy lookup path

**-d**, **--datadir** _PATH_
> Path to historical data directory

**--userdir** _PATH_
> Path to user data directory

**-v**, **--verbose**
> Verbose mode (-vv for more, -vvv for all)

**--logfile** _FILE_
> Log to specified file

**--no-color**
> Disable colorized output

**--db-url** _URL_
> Database URL for trade storage

**--dry-run**
> Run in simulation mode without real trades

**-V**, **--version**
> Show version number

**-h**, **--help**
> Show help message

# COMMANDS

**trade**
> Start live or dry-run trading

**backtesting**
> Test strategy on historical data

**hyperopt**
> Optimize strategy parameters

**download-data**
> Download historical OHLCV data

**new-config**
> Create new configuration interactively

**create-userdir**
> Create user data directory structure

**list-exchanges**
> Print available exchanges

**list-pairs**
> Print available trading pairs

**list-strategies**
> Print available strategies

**list-timeframes**
> Print available timeframes

**show-trades**
> Display trades from database

**plot-dataframe**
> Plot strategy signals on chart

**plot-profit**
> Plot profit over time

**webserver**
> Start the FreqUI web interface

**install-ui**
> Install the FreqUI web interface

# DESCRIPTION

**freqtrade** is an open-source cryptocurrency trading bot written in Python. It supports automated trading on major exchanges including Binance, Kraken, Coinbase, and many others through the CCXT library.

The bot executes user-defined trading strategies that specify entry and exit conditions based on technical indicators. Strategies are Python classes that can be backtested against historical data before live deployment. The hyperopt feature uses machine learning to optimize strategy parameters.

Freqtrade operates in dry-run mode by default, simulating trades without real money. It can be controlled via Telegram bot or the FreqUI web interface. Trade data is stored in a SQLite database for analysis and the plot commands visualize strategy performance.

# CAVEATS

Cryptocurrency trading carries significant financial risk. Backtesting results do not guarantee future performance. Exchange APIs may have rate limits that affect bot operation. Strategies require thorough testing in dry-run mode before live trading. Configuration files contain API keys and should be secured properly. The bot requires continuous operation and stable network connectivity.

# HISTORY

Freqtrade was started in **2017** as a community-driven open-source project. Written in **Python 3**, it grew from a simple trading bot to a comprehensive trading framework with backtesting, optimization, and visualization tools. The project gained significant traction during the 2020-2021 cryptocurrency bull market. It introduced FreqAI in **2022** for machine learning-based adaptive strategies. Development continues actively on GitHub with regular releases.

# SEE ALSO

[ccxt](/man/ccxt)(1), [ta-lib](/man/ta-lib)(3)
