# TLDR

**Search Wikipedia**

```wikit [topic]```

**Multiple word query**

```wikit "[linux kernel]"```

**Specific language**

```wikit -l [es] [topic]```

**Open in browser**

```wikit -b [topic]```

**Show full article**

```wikit -a [topic]```

**Disable line breaks**

```wikit -n [topic]```

# SYNOPSIS

**wikit** [_-l lang_] [_-b_] [_-a_] [_options_] _query_

# PARAMETERS

**-l**, **--lang** _LANG_
> Wikipedia language.

**-b**, **--browser**
> Open in browser.

**-a**, **--all**
> Full article.

**-n**, **--line**
> No line breaks.

**-d**, **--disambig**
> Show disambiguation.

# DESCRIPTION

**wikit** fetches Wikipedia summaries. Quick access to encyclopedia content.

Default shows first paragraph. Brief overview of topic.

Full article mode shows more. Extended content displayed.

Language selection uses other Wikipedias. Many languages available.

Browser mode opens full page. Read complete article online.

Disambiguation handles ambiguous queries. Multiple meanings listed.

# CAVEATS

Requires internet. Wikipedia API limits. Not all languages complete.

# HISTORY

**wikit** was created for quick Wikipedia lookups from the terminal. It provides instant access to encyclopedia knowledge.

# SEE ALSO

[curl](/man/curl)(1), [w3m](/man/w3m)(1)
