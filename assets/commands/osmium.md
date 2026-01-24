# TLDR

**Extract area from OSM file**

```osmium extract -b [left],[bottom],[right],[top] [input.osm.pbf] -o [output.osm.pbf]```

**Convert format**

```osmium cat [input.osm.pbf] -o [output.osm.xml]```

**Merge multiple files**

```osmium merge [file1.osm.pbf] [file2.osm.pbf] -o [merged.osm.pbf]```

**Filter by tags**

```osmium tags-filter [input.osm.pbf] -o [output.osm.pbf] [nwr/highway]```

**Show file info**

```osmium fileinfo [file.osm.pbf]```

**Check file integrity**

```osmium check-refs [file.osm.pbf]```

**Sort OSM data**

```osmium sort [input.osm] -o [sorted.osm]```

**Get difference between files**

```osmium diff [old.osm.pbf] [new.osm.pbf]```

# SYNOPSIS

**osmium** _command_ [_-o output_] [_options_] _files_

# PARAMETERS

**cat**
> Concatenate/convert files.

**extract**
> Extract region from file.

**merge**
> Merge sorted files.

**tags-filter**
> Filter by tags.

**sort**
> Sort OSM data.

**diff**
> Compare files.

**fileinfo**
> Show file information.

**check-refs**
> Check referential integrity.

**-o** _FILE_
> Output file.

**-b** _BBOX_
> Bounding box (left,bottom,right,top).

**-p** _POLYGON_
> Polygon file for extraction.

**--overwrite**
> Overwrite existing output.

**-f** _FORMAT_
> Output format.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**osmium** is a command-line tool for working with OpenStreetMap data. It processes, filters, and transforms OSM files efficiently.

Extract creates regional subsets from larger files. Bounding boxes define rectangular areas. Polygon files enable extraction of complex shapes like administrative boundaries.

Tags-filter creates files containing only specific feature types. Tag expressions select highways, buildings, points of interest, or custom combinations.

Merging combines multiple files into one, handling overlapping data correctly. Files must be sorted for merging. The sort command prepares unsorted data.

Format conversion handles PBF (Protocol Buffer Binary), OSM XML, and OPL (Object Per Line) formats. PBF is compressed and efficient; XML is human-readable.

Diff shows changes between file versions, useful for tracking map edits over time.

# CAVEATS

Large files require significant memory. Some operations need sorted input. Extraction may include incomplete relations. Complex filters have learning curve.

# HISTORY

**osmium** and the libosmium library were developed by **Jochen Topf** starting around **2013**. It became the standard command-line tool for OSM data processing, replacing older tools with better performance and reliability.

# SEE ALSO

[osm2pgsql](/man/osm2pgsql)(1), [osmconvert](/man/osmconvert)(1), [ogr2ogr](/man/ogr2ogr)(1)
