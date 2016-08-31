/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.routeopt.client.model.Route;
import com.graphhopper.routeopt.client.model.SolutionUnassigned;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Solution
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-31T10:35:10.244+02:00")
public class Solution   {
  @SerializedName("costs")
  private Integer costs = null;

  @SerializedName("distance")
  private Integer distance = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("no_unassigned")
  private Integer noUnassigned = null;

  @SerializedName("routes")
  private List<Route> routes = new ArrayList<Route>();

  @SerializedName("unassigned")
  private SolutionUnassigned unassigned = null;

  public Solution costs(Integer costs) {
    this.costs = costs;
    return this;
  }

   /**
   * overall costs of solution
   * @return costs
  **/
  @ApiModelProperty(example = "null", value = "overall costs of solution")
  public Integer getCosts() {
    return costs;
  }

  public void setCosts(Integer costs) {
    this.costs = costs;
  }

  public Solution distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * overall travel distance in meters
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "overall travel distance in meters")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public Solution time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * overall travel time in ms
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "overall travel time in ms")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public Solution noUnassigned(Integer noUnassigned) {
    this.noUnassigned = noUnassigned;
    return this;
  }

   /**
   * number of jobs that could not be assigned to final solution
   * @return noUnassigned
  **/
  @ApiModelProperty(example = "null", value = "number of jobs that could not be assigned to final solution")
  public Integer getNoUnassigned() {
    return noUnassigned;
  }

  public void setNoUnassigned(Integer noUnassigned) {
    this.noUnassigned = noUnassigned;
  }

  public Solution routes(List<Route> routes) {
    this.routes = routes;
    return this;
  }

  public Solution addRoutesItem(Route routesItem) {
    this.routes.add(routesItem);
    return this;
  }

   /**
   * An array of routes
   * @return routes
  **/
  @ApiModelProperty(example = "null", value = "An array of routes")
  public List<Route> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Route> routes) {
    this.routes = routes;
  }

  public Solution unassigned(SolutionUnassigned unassigned) {
    this.unassigned = unassigned;
    return this;
  }

   /**
   * Get unassigned
   * @return unassigned
  **/
  @ApiModelProperty(example = "null", value = "")
  public SolutionUnassigned getUnassigned() {
    return unassigned;
  }

  public void setUnassigned(SolutionUnassigned unassigned) {
    this.unassigned = unassigned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Solution solution = (Solution) o;
    return Objects.equals(this.costs, solution.costs) &&
        Objects.equals(this.distance, solution.distance) &&
        Objects.equals(this.time, solution.time) &&
        Objects.equals(this.noUnassigned, solution.noUnassigned) &&
        Objects.equals(this.routes, solution.routes) &&
        Objects.equals(this.unassigned, solution.unassigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, distance, time, noUnassigned, routes, unassigned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Solution {\n");
    
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    noUnassigned: ").append(toIndentedString(noUnassigned)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
