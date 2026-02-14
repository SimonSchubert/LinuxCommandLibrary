# TAGLINE

Command line interface to the WordNet lexical database

# TLDR

**Look up synonyms** of a noun

```wn [word] -synsn```

**Display the hypernym tree** (broader categories) for a noun

```wn [word] -hypen```

**Find antonyms** of an adjective

```wn [word] -antsa```

**Show an overview** of all senses of a word

```wn [word] -over```

**Display definitions** (glosses) for a noun

```wn [word] -g -synsn```

**Find hyponyms** (narrower categories) for a noun

```wn [word] -hypon```

**Search for compound words** containing a string

```wn [word] -grepn```

# SYNOPSIS

**wn** _searchstr_ [_-h_] [_-g_] [_-a_] [_-l_] [_-o_] [_-s_] [_-n#_] _search_option ..._

# PARAMETERS

**-g**
> Show textual glosses (definitions)

**-s**
> Show sense numbers in output

**-o**
> Display synset offset numbers

**-a**
> Show all synsets related to the search string

**-n** _#_
> Restrict results to a specific sense number

**-h**
> Display help text

**-l**
> Display license and copyright information

# DESCRIPTION

**wn** provides a command-line interface to the **WordNet** lexical database, displaying synsets (sets of synonyms) and semantic relations as formatted text. For each word, different searches are available based on syntactic category (noun, verb, adjective, adverb) and relation type.

Search options end with a letter indicating the part of speech: **n** for nouns, **v** for verbs, **a** for adjectives, **r** for adverbs. Multiple searches can be combined in a single command.

The tool automatically performs morphological analysis, so inflected forms (e.g., "running") are resolved to their base form.

# SEARCH OPTIONS

**-syns**(n|v|a|r)
> Display synonyms and immediate hypernyms of matching synsets

**-ants**(n|v|a|r)
> Display direct antonyms (opposites)

**-hype**(n|v)
> Recursively display the hypernym tree (broader categories)

**-hypo**(n|v)
> Display immediate hyponyms (narrower categories)

**-tree**(n|v)
> Display the subordinate hierarchy tree

**-deri**(n|v)
> Show morphologically related word forms

**-over**
> Display an overview of all senses across all parts of speech

**-grep**(n|v|a|r)
> List compound words containing the search string

**-sims**v
> Group verb senses by similarity of meaning

# CAVEATS

WordNet's last official Princeton release was in **2011**, so coverage of newer vocabulary is limited. The database is English-only. Results are ordered by frequency of use, which may not reflect specialized domain usage.

# HISTORY

**WordNet** was created in **1985** at **Princeton University's** Cognitive Science Laboratory under the direction of psychologist **George Armitage Miller**. Later directed by **Christiane Fellbaum**, the project received the **2006 Antonio Zampolli Prize**. Initially funded by the U.S. Office of Naval Research and later by DARPA and NSF.

# SEE ALSO

[dict](/man/dict)(1), [aspell](/man/aspell)(1), [grep](/man/grep)(1)
