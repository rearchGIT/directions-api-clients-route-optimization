/* 
 * Route Optimization API
 *
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package graphhopper

type Activity struct {

	// type of activity
	Type_ string `json:"type,omitempty"`

	// id referring to the underlying service or shipment, i.e. the shipment or service this activity belongs to
	Id string `json:"id,omitempty"`

	// id that refers to address
	LocationId string `json:"location_id,omitempty"`

	// arrival time at this activity in ms
	ArrTime int64 `json:"arr_time,omitempty"`

	// end time of and thus departure time at this activity
	EndTime int64 `json:"end_time,omitempty"`

	// waiting time at this activity in ms
	WaitingTime int64 `json:"waiting_time,omitempty"`

	// cumulated distance from start to this activity in m
	Distance int64 `json:"distance,omitempty"`

	// driving time of driver in ms
	DrivingTime int64 `json:"driving_time,omitempty"`

	// Array with size/capacity dimensions before this activity
	LoadBefore []int32 `json:"load_before,omitempty"`

	// Array with size/capacity dimensions after this activity
	LoadAfter []int32 `json:"load_after,omitempty"`
}
