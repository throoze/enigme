/*
 * Copyright (C) 2014 Victor De Ponte
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ve.org.enigme.config;

/**
 *
 * @author Victor De Ponte
 */
public class Config {
    
    public final static String PROJECT_ROOT = "/";
    public final static String ENIGME_ROOT = PROJECT_ROOT + "ve/org/enigme/";
    
    public static class Assets {
        public final static String ASSETS = PROJECT_ROOT;
        public final static String LOGO_IMAGE = ASSETS + "img/EinSof.jpg";
        public final static String ICON_IMAGE = ASSETS + "img/icon.png";
    }
}
