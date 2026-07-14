# TAGLINE

Validate and test Elasticsearch cron expressions

# TLDR

**Evaluate a cron expression** (fires every day at noon)

```elasticsearch-croneval "[0 0 12 * * ?]"```

**Show the next N trigger times**

```elasticsearch-croneval -c [20] "[0 0/5 * * * ?]"```

Evaluate an expression that fires **on weekday mornings**

```elasticsearch-croneval "[0 30 9 ? * MON-FRI]"```

**Show the stack trace** when an expression is rejected

```elasticsearch-croneval -d "[0 0 12 * *]"```

# SYNOPSIS

**elasticsearch-croneval** _expression_ [**-c**|**--count** _count_] [**-d**|**--detail**] [**-s**|**--silent**] [**-v**|**--verbose**]

# PARAMETERS

_expression_
> The cron expression to evaluate. Quote it, because it contains shell-significant characters.

**-c**, **--count** _number_
> Number of future trigger times to print. Defaults to 10.

**-d**, **--detail**
> Show detail for invalid expressions, printing the stack trace when parsing fails.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

**-h**, **--help**
> Show the command parameters.

# DESCRIPTION

**elasticsearch-croneval** validates an Elasticsearch cron expression and prints the next times it would fire. It is the quickest way to check a Watcher schedule, a snapshot lifecycle policy, or an ILM rollover schedule before putting it into a cluster.

The tool lives in $ES_HOME/bin and runs offline: it does not need a running cluster.

# CRON FORMAT

Elasticsearch cron expressions are Quartz-style and take six or seven fields, not the five of Unix cron. Seconds come first, and the year is optional.

```
<seconds> <minutes> <hours> <day_of_month> <month> <day_of_week> [year]
```

Exactly one of _day_of_month_ and _day_of_week_ must be **?** ("no specific value"), because the two cannot be constrained at the same time. So the crontab expression `0 12 * * *` becomes `0 0 12 * * ?` here.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [crontab](/man/crontab)(5)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Homepage](https://www.elastic.co/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/elasticsearch-croneval)```

<!-- verified: 2026-07-14 -->

