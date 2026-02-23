# TAGLINE

Open Text Summarizer for automatic text condensation

# TLDR

**Summarize** a text file to the default 20%

```ots [path/to/file.txt]```

**Summarize** a file to a specific **percentage**

```ots -r [10] [path/to/file.txt]```

**Summarize** and save to an **output file**

```ots -r [15] -o [summary.txt] [path/to/file.txt]```

**Generate** an **HTML** summary with highlighted sentences

```ots --html --out=[summary.html] [path/to/file.txt]```

**Extract** keywords and topic information

```ots --about [path/to/file.txt]```

**Summarize** using a specific **language** dictionary

```ots --dic=[de] [path/to/file.txt]```

**Summarize** from **stdin**

```cat [path/to/file.txt] | ots -r [10]```

# SYNOPSIS

**ots** [_OPTIONS..._] [_file.txt_ | _stdin_]

# PARAMETERS

**-r** _INT_, **--ratio=**_INT_
> Summarization percentage; sets output length as a percentage of the input. Default: **20**.

**-o** _FILE_, **--out=**_FILE_
> Output file path. Default: stdout.

**-h**, **--html**
> Output as HTML with important sentences highlighted

**-a**, **--about**
> Output only keyword and topic extraction (useful for generating meta-tag content)

**-d** _STRING_, **--dic=**_STRING_
> Specify a custom dictionary/language file for stop-word filtering

**-v**, **--version**
> Display version information

**-?**, **--help**
> Display help/usage information

# DESCRIPTION

**ots** (Open Text Summarizer) is an automatic text summarization tool that reads a document, determines which sentences are most important, and produces a condensed version. It performs **extractive summarization**, selecting and preserving original sentences rather than generating new prose.

The tool works in three stages: first it **filters** common stop words using XML-based language dictionaries, then performs **term frequency analysis** to score sentences by density of significant words, and finally applies **linguistic refinement** using the Porter Stemming Algorithm to group word variants. It supports **37+ languages** via XML dictionary files.

Output can be plain text or HTML with important sentences highlighted.

# CAVEATS

OTS performs extractive summarization only and does not generate new prose. It works best with well-structured non-fiction prose like news articles and technical documents. It performs poorly on fiction, short texts, lists, and bullet points. The Porter Stemmer is approximately 90% accurate and may miss morphological variants, especially in non-English languages. The last formal release (0.5.0) dates to **2007** and the codebase has not seen active feature development since.

# HISTORY

OTS was developed by **Nadav Rotem** starting in **April 2003**, with version 0.1.0 released in May 2003. Language support expanded to **24 languages** by July 2003 and eventually to over 37. It gained academic recognition, being cited in at least four publications. The library was integrated as a plugin into **AbiWord** and **gedit**. The latest release is version **0.5.0** from April 2007. It remains packaged in Debian, Ubuntu, Fedora, and other distributions.

# SEE ALSO

[wc](/man/wc)(1), [less](/man/less)(1), [fmt](/man/fmt)(1)
