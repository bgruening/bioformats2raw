/**
 * Copyright (c) 2022 Glencoe Software, Inc. All rights reserved.
 *
 * This software is distributed under the terms described by the LICENSE.txt
 * file you can find at the root of the distribution bundle.  If the file is
 * missing please request a copy by contacting info@glencoesoftware.com
 */
package com.glencoesoftware.bioformats2raw;

import java.util.EventListener;

public interface IProgressListener extends EventListener {

  /**
   * Indicates the total number of tiles in this conversion operation.
   * Includes all resolutions in all series.
   *
   * @param tileCount total number of tiles
   */
  void notifyTotalTileCount(long tileCount);

  /**
   * Indicates the beginning of processing a particular series.
   *
   * @param series the series index being processed
   * @param resolutionCount total number of resolutions in this series
   * @param tileCount total number of tiles for all resolutions in this series
   */
  void notifySeriesStart(int series, int resolutionCount, int tileCount);

  /**
   * Indicates the end of processing a particular series.
   *
   * @param series the series index being processed
   */
  void notifySeriesEnd(int series);

  /**
   * Indicates the beginning of processing a particular resolution.
   *
   * @param resolution the resolution index being processed
   * @param tileCount the total number of tiles in this resolution
   */
  void notifyResolutionStart(int resolution, int tileCount);

  /**
   * Indicates the end of processing a particular resolution.
   *
   * @param resolution the resolution index being processed
   */
  void notifyResolutionEnd(int resolution);

  /**
   * Indicates that the given chunk is about to be processed.
   *
   * @param plane plane index
   * @param xx X coordinate
   * @param yy Y coordinate
   * @param zz Z coordinate
   */
  void notifyChunkStart(int plane, int xx, int yy, int zz);

  /**
   * Indicates that the given chunk has been processed.
   *
   * @param plane plane index
   * @param xx X coordinate
   * @param yy Y coordinate
   * @param zz Z coordinate
   */
  void notifyChunkEnd(int plane, int xx, int yy, int zz);

}
