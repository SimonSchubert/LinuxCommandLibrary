# TLDR

**Evaluate cron expression**

```elasticsearch-croneval "[0 0 * * *]"```

**Show next N trigger times**

```elasticsearch-croneval -c [10] "[0 0 * * *]"```

**Detailed output**

```elasticsearch-croneval -d "[0 */5 * * *]"```

# SYNOPSIS

**elasticsearch-croneval** [_options_] _expression_

# PARAMETERS

**-c**, **--count** _number_
> Number of future times to show.

**-d**, **--detail**
> Show detailed output.

# DESCRIPTION

**elasticsearch-croneval** validates and evaluates Elasticsearch cron expressions. Shows when a cron schedule will trigger next. Useful for testing Watcher or ILM schedules.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [crontab](/man/crontab)(5)

